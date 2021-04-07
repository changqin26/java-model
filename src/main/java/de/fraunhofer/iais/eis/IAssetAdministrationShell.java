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
	"Asset Administration Shell"

	"Describes the Administration Shell for Assets, Products, Components, e.g. Machines"@en
*/
@JsonTypeInfo(use=JsonTypeInfo.Id.NAME, property="@type")
@JsonSubTypes({
@JsonSubTypes.Type(value = AssetAdministrationShellImpl.class),})
public interface IAssetAdministrationShell extends IHasDataSpecification
, IIdentifiable {

	// standard methods

	@JsonProperty("@id")
	public URI getId();
	public List<TypedLiteral> getLabel();
	public List<TypedLiteral> getComment();

	// accessor methods as derived from the Asset Administration Shell ontology


	/**
	"Meta information about the asset the AAS is representing."@en
	@return the IAssetInformation of assetAdministrationShellAssetInformation
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/assetInformation")
	public IAssetInformation getAssetAdministrationShellAssetInformation();

	/**
	"This relation connects instances of AAS with their respective types. Refer to Asset Kind for further information of instance and type kinds."@en
	@return the IReference of assetAdministrationShellDerivedFrom
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/derivedFrom")
	public IReference getAssetAdministrationShellDerivedFrom();

	/**
	"Definition of the security relevant aspects of the AAS."@en
	@return the ISecurity of assetAdministrationShellSecurity
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/security")
	public ISecurity getAssetAdministrationShellSecurity();

	/**
	"Points from the Admin Shell to the Submodels that describe the Admin Shell of a given Asset"@en
	@return the List of assetAdministrationShellSubmodel
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/submodel")
	public List<? extends ISubmodel> getAssetAdministrationShellSubmodel();

	/**
	"Points to the differents views associated to the Administration Shell via the Submodels."@en
	@return the List of assetAdministrationShellView
	*/
	@JsonProperty("https://admin-shell.io/aas/3/0/RC01/AssetAdministrationShell/view")
	public List<? extends IView> getAssetAdministrationShellView();
}
