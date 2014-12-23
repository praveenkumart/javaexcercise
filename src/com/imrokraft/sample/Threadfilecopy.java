package com.imrokraft.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Threadfilecopy extends Thread {

	@Override
	public void run() {
		try {
			File f1=new File("source.txt");
			File f2=new File("dest.txt");
			InputStream in=new FileInputStream(f1);
			OutputStream out=new FileOutputStream(f2);
			
			byte[] buf=new byte[1024];
			int len;
			while((len=in.read(buf))>0)
			{
				out.write(buf, 0, len);
			}
			System.out.println("File created and data copied");
			in.close();
			out.close();
		} catch (FileNotFoundException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		} catch (IOException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
	}
}

