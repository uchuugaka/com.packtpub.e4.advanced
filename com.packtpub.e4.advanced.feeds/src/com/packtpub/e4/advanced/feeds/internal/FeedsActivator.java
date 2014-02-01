/*
 * Copyright (c) 2014, Alex Blewitt, Bandlem Ltd
 * Copyright (c) 2014, Packt Publishing Ltd
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.packtpub.e4.advanced.feeds.internal;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
public class FeedsActivator implements BundleActivator {
	private static BundleContext bundleContext;
	// private Dictionary<String,Object> priority(int priority) {
	//	Hashtable<String, Object> dict = new Hashtable<String,Object>();
	//	dict.put("service.ranking", new Integer(priority));
	//	return dict;
	// }
	@Override
	public void start(BundleContext context) throws Exception {
		// context.registerService(IFeedParser.class, new RSSFeedParser(), priority(1));
		// context.registerService(IFeedParser.class, new MockFeedParser(), priority(-1));
		// context.registerService(IFeedParser.class, new AtomFeedParser(), priority(2));
		bundleContext = context;
	}
	@Override
	public void stop(BundleContext context) throws Exception {
		bundleContext = null;
	}
	public static BundleContext getContext() {
		return bundleContext;
	}
}
