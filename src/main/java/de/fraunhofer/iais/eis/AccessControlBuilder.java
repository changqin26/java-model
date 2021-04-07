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

public class AccessControlBuilder {

	private AccessControlImpl accessControlImpl;

	public AccessControlBuilder() {
		accessControlImpl = new AccessControlImpl();
	}

	public AccessControlBuilder(URI id) {
		this();
		accessControlImpl.id = id;
	}

	final public AccessControlBuilder _accessControlAccessPermissionRule_(ArrayList<? extends IAccessPermissionRule> _accessControlAccessPermissionRule_) {
		this.accessControlImpl._accessControlAccessPermissionRule = _accessControlAccessPermissionRule_;
		return this;
	}


	final public AccessControlBuilder _accessControlSelectableSubjectAttributes_(ISubmodel _accessControlSelectableSubjectAttributes_) {
		this.accessControlImpl._accessControlSelectableSubjectAttributes = _accessControlSelectableSubjectAttributes_;
		return this;
	}


	final public AccessControlBuilder _accessControlDefaultSubjectAttributes_(ISubmodel _accessControlDefaultSubjectAttributes_) {
		this.accessControlImpl._accessControlDefaultSubjectAttributes = _accessControlDefaultSubjectAttributes_;
		return this;
	}


	final public AccessControlBuilder _accessControlSelectablePermissions_(ISubmodel _accessControlSelectablePermissions_) {
		this.accessControlImpl._accessControlSelectablePermissions = _accessControlSelectablePermissions_;
		return this;
	}


	final public AccessControlBuilder _accessControlDefaultPermissions_(ISubmodel _accessControlDefaultPermissions_) {
		this.accessControlImpl._accessControlDefaultPermissions = _accessControlDefaultPermissions_;
		return this;
	}


	final public AccessControlBuilder _accessControlSelectableEnvironmentAttributes_(ISubmodel _accessControlSelectableEnvironmentAttributes_) {
		this.accessControlImpl._accessControlSelectableEnvironmentAttributes = _accessControlSelectableEnvironmentAttributes_;
		return this;
	}


	final public AccessControlBuilder _accessControlDefaultEnvironmentAttributes_(ISubmodel _accessControlDefaultEnvironmentAttributes_) {
		this.accessControlImpl._accessControlDefaultEnvironmentAttributes = _accessControlDefaultEnvironmentAttributes_;
		return this;
	}

	final public IAccessControl build() throws ConstraintViolationException {
		VocabUtil.getInstance().validate(accessControlImpl);
		return accessControlImpl;
	}
}
