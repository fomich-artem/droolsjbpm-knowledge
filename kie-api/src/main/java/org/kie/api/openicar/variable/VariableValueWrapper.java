package org.kie.api.openicar.variable;

/**
 * 
 * @author <a href="mailto:a.fomichev@comsoft-corp.ru">Fomichev Artem</a> <br>
 *
 */
public interface VariableValueWrapper {

    /**
     * Gives original value
     */
    Object getValue() throws ConverterException;

    /**
     * Sets original value
     */
    void setValue(Object value) throws ConverterException;

    /**
     * Gives primitive value, simple representation of original value
     * wich can be persisted
     */
    Object getPrimitiveValue();

    /**
     * Checks value is null 
     */
    boolean isNull();

}
