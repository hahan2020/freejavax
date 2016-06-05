package me.javawraper.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import me.javawraper.util.ArrayRing;
import me.javawraper.util.ArrayWraper;
import me.javawraper.util.Ring;

public class StreamReader {

	
	/**
	 * @param input 
	 * @param until 
	 * @param max			最多读取数，一般就是读到这里就到流的尽头了
	 * @param output		中间读取的内容存放地
	 * @return				读取的数量
	 * @throws IOException 
	 */
	public static long readUntil(InputStream input, byte[] until, long max, OutputStream output) throws IOException {
		Byte[] wrapUntil = ArrayWraper.wrap(until);
		Ring<Byte> ring = new ArrayRing<Byte>(until.length);
		long readSum=0;
		byte[] b = new byte[1];
		while(input.read(b) != -1 && readSum < max) {
			readSum++;
			Byte r = ring.next();
			ring.add(b[0]);
			if (r != null) {
				output.write(r.byteValue());
			}
			if (b[0] == until[until.length-1] && ring.equals(wrapUntil)) {
				//表明已经匹配成功
				break;
			}
		}
		return readSum;
	}

}
