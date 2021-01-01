
package org.kie.api.openicar;

import org.kie.api.KieBase;
import org.kie.api.openicar.profiler.Profiler;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.process.ProcessInstance;

/**
 * OpenIcar-integration
 * 
 * See also {@link KnowledgeServiceLocator}
 * 
 * @author <a href="mailto:a.fomichev@comsoft-corp.ru">Fomichev Artem</a> <br>
 *
 */
public interface KnowledgeService {

    KieBase getKnowledgeBase();

    String getRealProcesId(String processId);

    KieSession getStatefulKnowledgeSession();

    void releaseStatefulKnowledgeSession();

    Long getStatefulKnowledgeSessionId(KieSession ksession);

    Long getCurrentStatefulKnowledgeSessionId();

    boolean isStarted();

    long getTimerOverdueDelay();

    String getClusterNodeName();

    Profiler getProfiler();

    Long getRootProcessInstanceId(ProcessInstance processInstance);

}
