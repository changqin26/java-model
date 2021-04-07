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
import com.fasterxml.jackson.databind.JsonNode;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** 
	"Data Type IEC61360"

	"Enumeration of all IEC 61360 defined data types."@en 
*/
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@JsonTypeName("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DataTypeIEC61360")
public enum DataTypeIEC61360 {

	/** 
	"boolean according to IEC61360"
	*/
	BOOLEAN("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/BOOLEAN", Arrays.asList(new TypedLiteral("boolean according to IEC61360", "")), Collections.emptyList()),

	/** 
	"date according to IEC61360"
	*/
	DATE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/DATE", Arrays.asList(new TypedLiteral("date according to IEC61360", "")), Collections.emptyList()),

	/** 
	"integer count according to IEC61360"
	*/
	INTEGER_COUNT("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/INTEGER_COUNT", Arrays.asList(new TypedLiteral("integer count according to IEC61360", "")), Collections.emptyList()),

	/** 
	"integer currency according to IEC61360"

	"real currency according to IEC61360"
	*/
	INTEGER_CURRENCY("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/INTEGER_CURRENCY", Arrays.asList(new TypedLiteral("integer currency according to IEC61360", ""),
new TypedLiteral("real currency according to IEC61360", "")), Collections.emptyList()),

	/** 
	"integer measure according to IEC61360"
	*/
	INTEGER_MEASURE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/INTEGER_MEASURE", Arrays.asList(new TypedLiteral("integer measure according to IEC61360", "")), Collections.emptyList()),

	/** 
	"retional according to IEC61360"
	*/
	RATIONAL("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/RATIONAL", Arrays.asList(new TypedLiteral("retional according to IEC61360", "")), Collections.emptyList()),

	/** 
	"retional measure according to IEC61360"
	*/
	RATIONAL_MEASURE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/RATIONAL_MEASURE", Arrays.asList(new TypedLiteral("retional measure according to IEC61360", "")), Collections.emptyList()),

	/** 
	"real count according to IEC61360"
	*/
	REAL_COUNT("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/REAL_COUNT", Arrays.asList(new TypedLiteral("real count according to IEC61360", "")), Collections.emptyList()),

	/** 
	"real measure according to IEC61360"
	*/
	REAL_MEASURE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/REAL_MEASURE", Arrays.asList(new TypedLiteral("real measure according to IEC61360", "")), Collections.emptyList()),

	/** 
	"string according to IEC61360"
	*/
	STRING("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/STRING", Arrays.asList(new TypedLiteral("string according to IEC61360", "")), Collections.emptyList()),

	/** 
	"translatable string according to IEC61360"
	*/
	STRING_TRANSLATABLE("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/STRING_TRANSLATABLE", Arrays.asList(new TypedLiteral("translatable string according to IEC61360", "")), Collections.emptyList()),

	/** 
	"time according to IEC61360"
	*/
	TIME("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/TIME", Arrays.asList(new TypedLiteral("time according to IEC61360", "")), Collections.emptyList()),

	/** 
	"time stamp according to IEC61360"
	*/
	TIMESTAMP("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/TIMESTAMP", Arrays.asList(new TypedLiteral("time stamp according to IEC61360", "")), Collections.emptyList()),

	/** 
	"url according to IEC61360"
	*/
	URL("https://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360/3/0/RC01/URL", Arrays.asList(new TypedLiteral("url according to IEC61360", "")), Collections.emptyList());

	private static final Map<String,DataTypeIEC61360> uriInstanceMapping;
	static {
		uriInstanceMapping = new HashMap<>();
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.toString(), instance -> instance)));
		uriInstanceMapping.putAll(Stream.of(values()).collect(Collectors.toMap(instance -> instance.getSerializedId().toString(), instance -> instance)));
	}

	private URI id;
	private List<TypedLiteral> label;
	private List<TypedLiteral> comment;


	DataTypeIEC61360(String id, List<TypedLiteral> label, List<TypedLiteral> comment) {
		try {
			this.id = new URI(id);
			this.label = label;
			this.comment = comment;
		}
		catch (java.net.URISyntaxException e) {
			throw new IllegalArgumentException(e);
		}
	}

	@JsonIgnore
	final public URI getId() {
		return id;
	}

	@JsonIgnore
	final public List<TypedLiteral> getLabel() {
		return label;
	}

	@JsonIgnore
	final public List<TypedLiteral> getComment() {
		return comment;
	}


	@JsonProperty("@id")
	final public URI getSerializedId() {
		return id;
	}
	

	@Override
	public String toString() {
		return id.toString();
	}

}
