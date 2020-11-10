package org.drools.openicar.variable;

import org.drools.openicar.KnowledgeService;

/**
 * OpenIcar variable service
 * 
 * @author <a href="mailto:a.fomichev@comsoft-corp.ru">Fomichev Artem</a> <br>
 *
 */
public interface VariableService extends KnowledgeService {

	VariableValueWrapper wrapVariable(Object value);
	Object unwrapVariable(Object value);

}
