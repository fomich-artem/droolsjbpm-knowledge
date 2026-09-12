
package org.kie.api.openicar;

/**
 * {@link KnowledgeService}-implementation locator
 *
 * mosaek (де-Сим, 2026-09-12): канон резолвил сервис через Seam
 * ({@code org.jboss.seam.Component.getInstance( KNOWLEDGE_SERVICE_CONTEXT_VARIABLE, true )});
 * вне контейнера Seam (Spring Boot) реестр недоступен, поэтому сервис
 * выставляется движком явно при старте ({@code Jbpm5Engine.initGlobals}
 * &rarr; {@link #setInstance(KnowledgeService)}). Поле
 * KNOWLEDGE_SERVICE_CONTEXT_VARIABLE оставлено для совместимости,
 * в резолве не участвует.
 *
 * @author <a href="mailto:a.fomichev@comsoft-corp.ru">Fomichev Artem</a> <br>
 *
 */
public class KnowledgeServiceLocator {

    public static String KNOWLEDGE_SERVICE_CONTEXT_VARIABLE = "knowledgeService";

    private static volatile KnowledgeService instance;

    public static void setInstance(KnowledgeService service) {
        KnowledgeServiceLocator.instance = service;
    }

    public static KnowledgeService getInstance() {
        return getInstance(KnowledgeService.class);
    }

    public static <T extends KnowledgeService> T getInstance(Class<T> clazz) {
        return (T) instance;
    }

}
