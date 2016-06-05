package org.hahan.javawraper.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class CloseUtil {

	/**
	 * Closeable最上层的
	 */
	public static void close(Closeable closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/****       Stream开始          ****/
	
	public static void close(InputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(OutputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(FileInputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(FileOutputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(BufferedInputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(BufferedOutputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(DataInputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(DataOutputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(ByteArrayInputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(ByteArrayOutputStream closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/****       Stream结束          ****/

	/****       Reader Writer开始          ****/
	public static void close(Reader closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(Writer closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(InputStreamReader closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(OutputStreamWriter closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(BufferedReader closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(BufferedWriter closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(FileReader closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void close(FileWriter closer) {
		if (closer ==null) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/****       Reader Writer结束          ****/
	
	public static void close(Socket closer) {
		if (closer ==null) return;
		if (closer.isClosed()) return;
		try {
			closer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
