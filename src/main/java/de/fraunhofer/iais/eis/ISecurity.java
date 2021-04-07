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
	"Security"

	"Container for security relevant information of the AAS."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = SecurityImpl.class),})
public interface ISecurity {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Access control policy points of the AAS."@en
	@return the IPolicyAdministrationPoint of securityAccessControlPolicyPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/accessControlPolicyPoints")
	public IPolicyAdministrationPoint getSecurityAccessControlPolicyPoints();

	/**
	"Certificates of the AAS."@en
	@return the List of securityCertificate
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/certificate")
	public List<? extends ICertificate> getSecurityCertificate();

	/**
	"Certificate extensions as required by the AAS."@en
	@return the List of securityRequiredCertificateExtension
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/Security/requiredCertificateExtension")
	public List<? extends IReference> getSecurityRequiredCertificateExtension();
}
