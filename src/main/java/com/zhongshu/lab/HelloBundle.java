package com.zhongshu.lab;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloBundle implements BundleActivator{

	public void start(BundleContext arg0) throws Exception {
		System.out.println("hello bundle");
		
	}

	public void stop(BundleContext arg0) throws Exception {
		System.out.println("bye bundle");
		
	}

}
