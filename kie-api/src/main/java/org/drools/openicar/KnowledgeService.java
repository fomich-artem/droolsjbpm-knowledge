
package org.drools.openicar;

import org.drools.KnowledgeBase;
import org.drools.openicar.profiler.Profiler;
import org.drools.runtime.StatefulKnowledgeSession;

/**
 * OpenIcar-integration
 * 
 * See also {@link KnowledgeServiceLocator}
 * 
 * @author <a href="mailto:a.fomichev@comsoft-corp.ru">Fomichev Artem</a> <br>
 *
 */
public interface KnowledgeService {

	KnowledgeBase getKnowledgeBase();

	String getRealProcesId(String processId);

	StatefulKnowledgeSession getStatefulKnowledgeSession();

	void releaseStatefulKnowledgeSession();

	int getStatefulKnowledgeSessionId(StatefulKnowledgeSession ksession);

	int getCurrentStatefulKnowledgeSessionId();

	boolean isStarted();

	long getTimerOverdueDelay();

	String getClusterNodeName();

	Profiler getProfiler();

}
