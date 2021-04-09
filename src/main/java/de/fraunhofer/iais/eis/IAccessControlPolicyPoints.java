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
* "Access ControlPolicy Points"
* "Container for access control policy points."@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
	@JsonSubTypes.Type(value = AccessControlPolicyPointsImpl.class)
})
public interface IAccessControlPolicyPoints {

	// standard methods

	/**
	* This function retrieves the ID of the current object (can be set via the constructor of the builder class)
	* @return ID of current object as URI
	*/
	@JsonProperty("@id")
	public URI getId();

	/**
	* This function retrieves a human readable label about the current class, as defined in the ontology.
	* This label could, for example, be used as a field heading in a user interface
	* @return Human readable label
	*/
	public List<TypedLiteral> getLabel();

	/**
	* This function retrieves a human readable explanatory comment about the current class, as defined in the ontology.
	* This comment could, for example, be used as a tooltip in a user interface
	* @return Human readable explanatory comment
	*/
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	* "The access control administration policy point of the AAS."@en
	* @return Returns the IPolicyAdministrationPoint for the property accessControlPolicyPointsPolicyAdministrationPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyAdministrationPoint")
	public IPolicyAdministrationPoint getAccessControlPolicyPointsPolicyAdministrationPoint();

	/**
	* "The access control policy decision point of the AAS."@en
	* @return Returns the IPolicyDecisionPoint for the property accessControlPolicyPointsPolicyDecisionPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyDecisionPoint")
	public IPolicyDecisionPoint getAccessControlPolicyPointsPolicyDecisionPoint();

	/**
	* "The access control policy enforcement point of the AAS."@en
	* @return Returns the IPolicyEnforcementPoints for the property accessControlPolicyPointsPolicyEnforcementPoint.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyEnforcementPoint")
	public IPolicyEnforcementPoints getAccessControlPolicyPointsPolicyEnforcementPoint();

	/**
	* "The access control policy information points of the AAS."@en
	* @return Returns the IPolicyInformationPoints for the property accessControlPolicyPointsPolicyInformationPoints.
	* More information under https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AccessControlPolicyPoints/policyInformationPoints")
	public IPolicyInformationPoints getAccessControlPolicyPointsPolicyInformationPoints();

}
