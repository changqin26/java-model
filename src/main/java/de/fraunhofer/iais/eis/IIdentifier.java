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
	"Identifier"

	"Used to uniquely identify an entity by using an identifier."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = IdentifierImpl.class),})
public interface IIdentifier {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"A globally unique identifier which might not be a URI. Its type is defined in idType."@en
	@return the List of identifierIdentifier
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/identifier")
	public List<? extends TypedLiteral> getIdentifierIdentifier();

	/**
	"Type of the Identifier, e.g. IRI, IRDI etc. The supported Identifier types are defined in the enumeration \'IdentifierType\'."@en
	@return the IdentifierType of identifierIdType
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Identifier/idType")
	public IdentifierType getIdentifierIdType();
}
