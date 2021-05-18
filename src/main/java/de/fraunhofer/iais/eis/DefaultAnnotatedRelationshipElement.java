package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;

/** 
* "Annotated Relationship Element"
* "An annotated relationship element is an relationship element that can be annotated with additional data elements."@en 
*/

public class DefaultAnnotatedRelationshipElement implements AnnotatedRelationshipElement {


	// instance fields as derived from the Asset Administration Shell ontology

	/**
	* "has annotation"
	* "Annotations that hold for the relationships between the two elements."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation")
	protected List<DataElement> annotations;


	/**
	* "has Data Specification"
	* "Global reference to the data specification template used by the element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	protected List<Reference> dataSpecifications;


	/**
	* "has kind"
	* "ModelingKind of the element: either type or instance."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	protected ModelingKind kind;


	/**
	* "has semantic ID"
	* "Points to the Expression Semantic of the Submodels"@en
	* "The semantic id might refer to an external information source, which explains the formulation of the submodel (for example an PDF if a standard)."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	protected Reference semanticId;


	/**
	* "has qualifier"
	* "Additional qualification of a qualifiable element."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	protected List<Constraint> qualifiers;


	/**
	* "has referable category"
	* "The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
	protected String category;


	/**
	* "has description"
	* "Description or comments on the element. The description can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	protected LangStringSet description;


	/**
	* "has display name"
	* "Display name. Can be provided in several languages."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	protected LangStringSet displayName;


	/**
	* "has short id"
	* "Identifying string of the element within its name space."@en
	* "Constraint AASd-002: idShort shall only feature letters, digits, underscore (\'_\'); starting with a small letter. I.e. [a-z][a-zA-Z0-9_]+."@en
	* "Constraint AASd-003: idShort shall be matched case-insensitive."@en
	* "Constraint AASd-022: idShort of non-identifiable referables shall be unqiue in its namespace."@en
	* "Note: In case the element is a property and the property has a semantic definition (HasSemantics) the idShort is typically identical to the short name in English. "@en
	* "Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the \'BrowserPath\' in OPC UA."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	protected String idShort;


	/**
	* "has first relationship"
	* "First element in the relationship taking the role of the subject."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
	protected Reference first;


	/**
	* "has second relationship"
	* "Second element in the relationship taking the role of the object."@en
	*/
	@IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
	protected Reference second;


	// no manual construction
	protected DefaultAnnotatedRelationshipElement() {
	}

	@Override
	public int hashCode() {
		return Objects.hash(new Object[]{this.annotations,
			this.first,
			this.second,
			this.category,
			this.description,
			this.displayName,
			this.idShort,
			this.qualifiers,
			this.dataSpecifications,
			this.kind,
			this.semanticId});
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		} else if (obj == null) {
			return false;
		} else if (this.getClass() != obj.getClass()) {
			return false;
		} else {
			DefaultAnnotatedRelationshipElement other = (DefaultAnnotatedRelationshipElement) obj;
			return Objects.equals(this.annotations, other.annotations) &&
				Objects.equals(this.first, other.first) &&
				Objects.equals(this.second, other.second) &&
				Objects.equals(this.category, other.category) &&
				Objects.equals(this.description, other.description) &&
				Objects.equals(this.displayName, other.displayName) &&
				Objects.equals(this.idShort, other.idShort) &&
				Objects.equals(this.qualifiers, other.qualifiers) &&
				Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
				Objects.equals(this.kind, other.kind) &&
				Objects.equals(this.semanticId, other.semanticId);
		}
	}

	@Override
	public Object deepCopy() {
		DefaultAnnotatedRelationshipElement other = new DefaultAnnotatedRelationshipElement();
		other.annotations = (List<DataElement>) Util.clone(this.annotations);
		other.first = (Reference) Util.clone(this.first);
		other.second = (Reference) Util.clone(this.second);
		other.category = (String) Util.clone(this.category);
		other.description = (LangStringSet) Util.clone(this.description);
		other.displayName = (LangStringSet) Util.clone(this.displayName);
		other.idShort = (String) Util.clone(this.idShort);
		other.qualifiers = (List<Constraint>) Util.clone(this.qualifiers);
		other.dataSpecifications = (List<Reference>) Util.clone(this.dataSpecifications);
		other.kind = (ModelingKind) Util.clone(this.kind);
		other.semanticId = (Reference) Util.clone(this.semanticId);
		return other;
	}


	// accessor method implementations as derived from the Asset Administration Shell ontology


	@IRI("https://admin-shell.io/aas/3/0/RC01/AnnotatedRelationshipElement/annotation")
	final public List<DataElement> getAnnotations() {
		return annotations;
	}
	
	final public void setAnnotations (List<DataElement> annotations) {
		this.annotations = annotations;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/first")
	final public Reference getFirst() {
		return first;
	}
	
	final public void setFirst (Reference first) {
		this.first = first;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/RelationshipElement/second")
	final public Reference getSecond() {
		return second;
	}
	
	final public void setSecond (Reference second) {
		this.second = second;
	}


	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/category")
	final public String getCategory() {
		return category;
	}
	
	final public void setCategory (String category) {
		this.category = category;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/description")
	final public LangStringSet getDescription() {
		return description;
	}
	
	final public void setDescription (LangStringSet description) {
		this.description = description;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/displayName")
	final public LangStringSet getDisplayName() {
		return displayName;
	}
	
	final public void setDisplayName (LangStringSet displayName) {
		this.displayName = displayName;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Referable/idShort")
	final public String getIdShort() {
		return idShort;
	}
	
	final public void setIdShort (String idShort) {
		this.idShort = idShort;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/Qualifiable/qualifier")
	final public List<Constraint> getQualifiers() {
		return qualifiers;
	}
	
	final public void setQualifiers (List<Constraint> qualifiers) {
		this.qualifiers = qualifiers;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasDataSpecification/dataSpecification")
	final public List<Reference> getDataSpecifications() {
		return dataSpecifications;
	}
	
	final public void setDataSpecifications (List<Reference> dataSpecifications) {
		this.dataSpecifications = dataSpecifications;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasKind/kind")
	final public ModelingKind getKind() {
		return kind;
	}
	
	final public void setKind (ModelingKind kind) {
		this.kind = kind;
	}

	@IRI("https://admin-shell.io/aas/3/0/RC01/HasSemantics/semanticId")
	final public Reference getSemanticId() {
		return semanticId;
	}
	
	final public void setSemanticId (Reference semanticId) {
		this.semanticId = semanticId;
	}
}
