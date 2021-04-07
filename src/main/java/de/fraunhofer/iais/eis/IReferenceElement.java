package de.fraunhofer.iais.eis;

import de.fraunhofer.iais.eis.util.*;
import de.fraunhofer.iais.eis.*;

import javax.xml.datatype.XMLGregorianCalendar;
import java.lang.String;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
	"Reference Element"

	"A reference element is a data element that defines a logical reference to another element within the same or another AAS or a reference to an external object or entity."@en

	"Constraint AASd-054: The semanticId of a ReferenceElement shall only reference a ConceptDescription with the category REFERENCE."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = ReferenceElementImpl.class),})
public interface IReferenceElement extends IDataElement {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Reference to any other referable element of the same of any other AAS or a reference to an external object or entity."@en
	@return the IReference of referenceElementValue
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/ReferenceElement/value")
	public IReference getReferenceElementValue();
}
