package io.adminshell.aas.v3.model.builder;

import java.util.List;



import de.fraunhofer.iais.eis.util.*;
import io.adminshell.aas.v3.dataformat.*;
import io.adminshell.aas.v3.model.*;
import io.adminshell.aas.v3.model.impl.*;

public abstract class EventMessageBuilder<T extends EventMessage, B extends EventMessageBuilder<T, B>> extends ExtendableBuilder<T, B> {

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

    /**
     * This function allows setting a value for dataSpecifications
     * 
     * @param dataSpecifications desired value to be set
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecifications(List<Reference> dataSpecifications) {
        getBuildingInstance().setDataSpecifications(dataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecifications
     * 
     * @param dataSpecification desired value to be added
     * @return Builder object with new value for dataSpecifications
     */
    public B dataSpecification(Reference dataSpecification) {
        getBuildingInstance().getDataSpecifications().add(dataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for dataSpecificationContents
     * 
     * @param dataSpecificationContents desired value to be set
     * @return Builder object with new value for dataSpecificationContents
     */
    public B dataSpecificationContents(List<DataSpecificationContent> dataSpecificationContents) {
        getBuildingInstance().setDataSpecificationContents(dataSpecificationContents);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List dataSpecificationContents
     * 
     * @param dataSpecificationContent desired value to be added
     * @return Builder object with new value for dataSpecificationContents
     */
    public B dataSpecificationContent(DataSpecificationContent dataSpecificationContent) {
        getBuildingInstance().getDataSpecificationContents().add(dataSpecificationContent);
        return getSelf();
    }

    /**
     * This function allows setting a value for embeddedDataSpecifications
     * 
     * @param embeddedDataSpecifications desired value to be set
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        getBuildingInstance().setEmbeddedDataSpecifications(embeddedDataSpecifications);
        return getSelf();
    }

    /**
     * This function allows adding a value to the List embeddedDataSpecifications
     * 
     * @param embeddedDataSpecification desired value to be added
     * @return Builder object with new value for embeddedDataSpecifications
     */
    public B embeddedDataSpecification(EmbeddedDataSpecification embeddedDataSpecification) {
        getBuildingInstance().getEmbeddedDataSpecifications().add(embeddedDataSpecification);
        return getSelf();
    }

    /**
     * This function allows setting a value for kind
     * 
     * @param kind desired value to be set
     * @return Builder object with new value for kind
     */
    public B kind(ModelingKind kind) {
        getBuildingInstance().setKind(kind);
        return getSelf();
    }

    /**
     * This function allows setting a value for semanticId
     * 
     * @param semanticId desired value to be set
     * @return Builder object with new value for semanticId
     */
    public B semanticId(Reference semanticId) {
        getBuildingInstance().setSemanticId(semanticId);
        return getSelf();
    }
}
