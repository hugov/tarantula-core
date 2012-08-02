package br.com.decimal.tarantula.function;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * 
 * @author Vitor Hugo Oliveira
 * 
 */
public class JDependecy {

	public static void main(String[] args) {

		System.out.println("JDependency ...");

		// Get the System Classloader
		ClassLoader sysClassLoader = ClassLoader.getSystemClassLoader();

		// Get the URLs
		URL[] urls = ((URLClassLoader) sysClassLoader).getURLs();
		System.out.println("CURRENT CLASSPATH :");
		for (int i = 0; i < urls.length; i++) {
			System.out.println(urls[i].getFile());
		}
		System.out.println("END OF CLASSPATH");

	}

}
