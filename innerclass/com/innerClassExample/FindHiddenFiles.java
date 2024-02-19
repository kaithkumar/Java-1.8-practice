/**
 * 
 */
package com.innerClassExample;

import java.io.File;
import java.io.FileFilter;

/**
 * @author 91888
 *
 */
public class FindHiddenFiles {
	
	public static void main(String[] args) {
		File f = new File(System.getProperty("user.dir"));
		
		// passing filefilter object as a innerclass
		File[] listFiles = f.listFiles(new FileFilter() {
			@Override
			public boolean accept(File eachFile) {
				return eachFile.isHidden();
			}
		});
		
		for (File file : listFiles) {
			System.out.println(file);
		}
     }

}
