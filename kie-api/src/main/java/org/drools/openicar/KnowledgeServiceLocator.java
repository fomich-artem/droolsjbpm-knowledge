
package org.drools.openicar;

import org.jboss.seam.Component;

/**
 * {@link KnowledgeService}-implementation locator
 * 
 * @author <a href="mailto:a.fomichev@comsoft-corp.ru">Fomichev Artem</a> <br>
 *
 */
public class KnowledgeServiceLocator {

	public static String KNOWLEDGE_SERVICE_CONTEXT_VARIABLE = "knowledgeService";

	public static KnowledgeService getInstance() {
		return (KnowledgeService) Component.getInstance(KNOWLEDGE_SERVICE_CONTEXT_VARIABLE, true);
	}

}
