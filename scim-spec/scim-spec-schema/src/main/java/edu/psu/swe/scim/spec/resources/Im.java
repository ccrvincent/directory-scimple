package edu.psu.swe.scim.spec.resources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import edu.psu.swe.scim.spec.annotation.ScimAttribute;
import edu.psu.swe.scim.spec.schema.Schema.Attribute.Type;
import lombok.Data;

/**
 * Scim core schema, <a href="https://tools.ietf.org/html/rfc7643#section-4.1.2>section 4.1.2</a>
 *
 */
@XmlType
@XmlAccessorType(XmlAccessType.NONE)
@Data
public class Im {
  
  @XmlElement(nillable=true)
  @ScimAttribute(canonicalValues={"aim", "qtalk", "icq", "xmpp", "msn", "skype", "qq", "yahoo"}, description="A label indicating the attribute's function; e.g., 'aim', 'gtalk', 'mobile' etc.")
  String type;
  
  @XmlElement
  @ScimAttribute(description="Instant messaging address for the User.")
  String value;
  
  @XmlElement
  @ScimAttribute(description="A human readable name, primarily used for display purposes. READ-ONLY.")
  String display;
  
  @XmlElement
  @ScimAttribute(type=Type.BOOLEAN, description="A Boolean value indicating the 'primary' or preferred attribute value for this attribute, e.g. the preferred mailing address or primary e-mail address. The primary attribute value 'true' MUST appear no more than once.")
  Boolean primary = false;
}