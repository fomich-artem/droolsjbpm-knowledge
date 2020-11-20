package org.drools.openicar.profiler;

import org.drools.openicar.KnowledgeServiceLocator;

public class SimpleProfiler {

    static ThreadLocal<Profiler> tlProfiler = new ThreadLocal<Profiler>() {
        @Override
        protected Profiler initialValue() {
            return KnowledgeServiceLocator.getInstance().getProfiler();
        }
    };

	public static void st(String suffix) {
	    tlProfiler.get().st(suffix);
	}

	public static void en(String suffix) {
	    tlProfiler.get().en(suffix);
	}

}
