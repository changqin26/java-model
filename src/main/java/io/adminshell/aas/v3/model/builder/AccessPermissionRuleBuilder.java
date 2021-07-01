package io.adminshell.aas.v3.model.builder;

import java.util.List;



import io.adminshell.aas.v3.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class AccessPermissionRuleBuilder<T extends AccessPermissionRule, B extends AccessPermissionRuleBuilder<T, B>>
    extends ExtendableBuilder<T, B> {

    /**
     * This function allows setting a value for permissionsPerObjects
     * 
     * @param permissionsPerObjects desired value to be set
     * @return Builder object with new value for permissionsPerObjects
     */
    public B permissionsPerObjects(List<PermissionsPerObject> permissionsPerObjects) {
        getBuildingInstance().setPermissionsPerObjects(permissionsPerObjects);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List permissionsPerObjects
     * 
     * @param permissionsPerObject desired value to be added
     * @return Builder object with new value for permissionsPerObjects
     */
    public B permissionsPerObject(PermissionsPerObject permissionsPerObject) {
        getBuildingInstance().getPermissionsPerObjects().add(permissionsPerObject);
        return getSelf();
    }

    /**
     * This function allows setting a value for targetSubjectAttributes
     * 
     * @param targetSubjectAttributes desired value to be set
     * @return Builder object with new value for targetSubjectAttributes
     */
    public B targetSubjectAttributes(SubjectAttributes targetSubjectAttributes) {
        getBuildingInstance().setTargetSubjectAttributes(targetSubjectAttributes);
        return getSelf();
    }

    /**
     * This function allows setting a value for category
     * 
     * @param category desired value to be set
     * @return Builder object with new value for category
     */
    public B category(String category) {
        getBuildingInstance().setCategory(category);
        return getSelf();
    }

    /**
     * This function allows setting a value for descriptions
     * 
     * @param descriptions desired value to be set
     * @return Builder object with new value for descriptions
     */
    public B descriptions(List<LangString> descriptions) {
        getBuildingInstance().setDescriptions(descriptions);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List descriptions
     * 
     * @param description desired value to be added
     * @return Builder object with new value for descriptions
     */
    public B description(LangString description) {
        getBuildingInstance().getDescriptions().add(description);
        return getSelf();
    }

    /**
     * This function allows setting a value for displayNames
     * 
     * @param displayNames desired value to be set
     * @return Builder object with new value for displayNames
     */
    public B displayNames(List<LangString> displayNames) {
        getBuildingInstance().setDisplayNames(displayNames);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List displayNames
     * 
     * @param displayName desired value to be added
     * @return Builder object with new value for displayNames
     */
    public B displayName(LangString displayName) {
        getBuildingInstance().getDisplayNames().add(displayName);
        return getSelf();
    }

    /**
     * This function allows setting a value for idShort
     * 
     * @param idShort desired value to be set
     * @return Builder object with new value for idShort
     */
    public B idShort(String idShort) {
        getBuildingInstance().setIdShort(idShort);
        return getSelf();
    }

    /**
     * This function allows setting a value for qualifiers
     * 
     * @param qualifiers desired value to be set
     * @return Builder object with new value for qualifiers
     */
    public B qualifiers(List<Constraint> qualifiers) {
        getBuildingInstance().setQualifiers(qualifiers);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List qualifiers
     * 
     * @param qualifier desired value to be added
     * @return Builder object with new value for qualifiers
     */
    public B qualifier(Constraint qualifier) {
        getBuildingInstance().getQualifiers().add(qualifier);
        return getSelf();
    }
}
