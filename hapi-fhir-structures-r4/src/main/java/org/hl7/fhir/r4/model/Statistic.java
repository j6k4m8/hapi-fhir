package org.hl7.fhir.r4.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Mon, Apr 22, 2019 09:16-0500 for FHIR v4.1.0

import java.util.*;

import java.math.*;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r4.model.Enumerations.*;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.exceptions.FHIRException;
/**
 * The Statistic resource codifies a statistical measure and corresponding certainty.
 */
@ResourceDef(name="Statistic", profile="http://hl7.org/fhir/StructureDefinition/Statistic")
@ChildOrder(names={"url", "identifier", "version", "title", "status", "date", "useContext", "approvalDate", "lastReviewDate", "statisticPublisher", "contributor", "relatedArtifact", "description", "note", "synthesisType", "studyType", "exposureBackground", "exposure", "exposureVariant", "measuredVariable", "statisticType", "quantity", "sampleSize", "precisionEstimate", "pValue", "certainty"})
public class Statistic extends MetadataResource {

    @Block()
    public static class StatisticStatisticPublisherComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The name of the publisher.
         */
        @Child(name = "name", type = {StringType.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="The name of the publisher", formalDefinition="The name of the publisher." )
        protected StringType name;

        /**
         * Contact details for the  publisher.
         */
        @Child(name = "contact", type = {ContactDetail.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Contact details for the  publisher", formalDefinition="Contact details for the  publisher." )
        protected List<ContactDetail> contact;

        private static final long serialVersionUID = 1489128073L;

    /**
     * Constructor
     */
      public StatisticStatisticPublisherComponent() {
        super();
      }

    /**
     * Constructor
     */
      public StatisticStatisticPublisherComponent(StringType name) {
        super();
        this.name = name;
      }

        /**
         * @return {@link #name} (The name of the publisher.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StringType getNameElement() { 
          if (this.name == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticStatisticPublisherComponent.name");
            else if (Configuration.doAutoCreate())
              this.name = new StringType(); // bb
          return this.name;
        }

        public boolean hasNameElement() { 
          return this.name != null && !this.name.isEmpty();
        }

        public boolean hasName() { 
          return this.name != null && !this.name.isEmpty();
        }

        /**
         * @param value {@link #name} (The name of the publisher.). This is the underlying object with id, value and extensions. The accessor "getName" gives direct access to the value
         */
        public StatisticStatisticPublisherComponent setNameElement(StringType value) { 
          this.name = value;
          return this;
        }

        /**
         * @return The name of the publisher.
         */
        public String getName() { 
          return this.name == null ? null : this.name.getValue();
        }

        /**
         * @param value The name of the publisher.
         */
        public StatisticStatisticPublisherComponent setName(String value) { 
            if (this.name == null)
              this.name = new StringType();
            this.name.setValue(value);
          return this;
        }

        /**
         * @return {@link #contact} (Contact details for the  publisher.)
         */
        public List<ContactDetail> getContact() { 
          if (this.contact == null)
            this.contact = new ArrayList<ContactDetail>();
          return this.contact;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticStatisticPublisherComponent setContact(List<ContactDetail> theContact) { 
          this.contact = theContact;
          return this;
        }

        public boolean hasContact() { 
          if (this.contact == null)
            return false;
          for (ContactDetail item : this.contact)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ContactDetail addContact() { //3
          ContactDetail t = new ContactDetail();
          if (this.contact == null)
            this.contact = new ArrayList<ContactDetail>();
          this.contact.add(t);
          return t;
        }

        public StatisticStatisticPublisherComponent addContact(ContactDetail t) { //3
          if (t == null)
            return this;
          if (this.contact == null)
            this.contact = new ArrayList<ContactDetail>();
          this.contact.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #contact}, creating it if it does not already exist
         */
        public ContactDetail getContactFirstRep() { 
          if (getContact().isEmpty()) {
            addContact();
          }
          return getContact().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("name", "string", "The name of the publisher.", 0, 1, name));
          children.add(new Property("contact", "ContactDetail", "Contact details for the  publisher.", 0, java.lang.Integer.MAX_VALUE, contact));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3373707: /*name*/  return new Property("name", "string", "The name of the publisher.", 0, 1, name);
          case 951526432: /*contact*/  return new Property("contact", "ContactDetail", "Contact details for the  publisher.", 0, java.lang.Integer.MAX_VALUE, contact);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return this.name == null ? new Base[0] : new Base[] {this.name}; // StringType
        case 951526432: /*contact*/ return this.contact == null ? new Base[0] : this.contact.toArray(new Base[this.contact.size()]); // ContactDetail
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3373707: // name
          this.name = castToString(value); // StringType
          return value;
        case 951526432: // contact
          this.getContact().add(castToContactDetail(value)); // ContactDetail
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("name")) {
          this.name = castToString(value); // StringType
        } else if (name.equals("contact")) {
          this.getContact().add(castToContactDetail(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707:  return getNameElement();
        case 951526432:  return addContact(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3373707: /*name*/ return new String[] {"string"};
        case 951526432: /*contact*/ return new String[] {"ContactDetail"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("name")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.name");
        }
        else if (name.equals("contact")) {
          return addContact();
        }
        else
          return super.addChild(name);
      }

      public StatisticStatisticPublisherComponent copy() {
        StatisticStatisticPublisherComponent dst = new StatisticStatisticPublisherComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(StatisticStatisticPublisherComponent dst) {
        super.copyValues(dst);
        dst.name = name == null ? null : name.copy();
        if (contact != null) {
          dst.contact = new ArrayList<ContactDetail>();
          for (ContactDetail i : contact)
            dst.contact.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof StatisticStatisticPublisherComponent))
          return false;
        StatisticStatisticPublisherComponent o = (StatisticStatisticPublisherComponent) other_;
        return compareDeep(name, o.name, true) && compareDeep(contact, o.contact, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof StatisticStatisticPublisherComponent))
          return false;
        StatisticStatisticPublisherComponent o = (StatisticStatisticPublisherComponent) other_;
        return compareValues(name, o.name, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(name, contact);
      }

  public String fhirType() {
    return "Statistic.statisticPublisher";

  }

  }

    @Block()
    public static class StatisticSampleSizeComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of population sample size.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of population sample size", formalDefinition="Human-readable summary of population sample size." )
        protected StringType description;

        /**
         * Footnote or explanatory note about the sample size.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnote or explanatory note about the sample size", formalDefinition="Footnote or explanatory note about the sample size." )
        protected List<Annotation> note;

        /**
         * Number of participants in the population.
         */
        @Child(name = "numberOfStudies", type = {IntegerType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of contributing studies", formalDefinition="Number of participants in the population." )
        protected IntegerType numberOfStudies;

        /**
         * A human-readable string to clarify or explain concepts about the sample size.
         */
        @Child(name = "numberOfParticipants", type = {IntegerType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Cumulative number of participants", formalDefinition="A human-readable string to clarify or explain concepts about the sample size." )
        protected IntegerType numberOfParticipants;

        /**
         * TBD.
         */
        @Child(name = "knownDataCount", type = {IntegerType.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="TBD", formalDefinition="TBD." )
        protected IntegerType knownDataCount;

        /**
         * TBD.
         */
        @Child(name = "numeratorCount", type = {IntegerType.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="TBD", formalDefinition="TBD." )
        protected IntegerType numeratorCount;

        private static final long serialVersionUID = 1908820199L;

    /**
     * Constructor
     */
      public StatisticSampleSizeComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human-readable summary of population sample size.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticSampleSizeComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Human-readable summary of population sample size.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StatisticSampleSizeComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of population sample size.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of population sample size.
         */
        public StatisticSampleSizeComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (Footnote or explanatory note about the sample size.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticSampleSizeComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public StatisticSampleSizeComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #numberOfStudies} (Number of participants in the population.). This is the underlying object with id, value and extensions. The accessor "getNumberOfStudies" gives direct access to the value
         */
        public IntegerType getNumberOfStudiesElement() { 
          if (this.numberOfStudies == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticSampleSizeComponent.numberOfStudies");
            else if (Configuration.doAutoCreate())
              this.numberOfStudies = new IntegerType(); // bb
          return this.numberOfStudies;
        }

        public boolean hasNumberOfStudiesElement() { 
          return this.numberOfStudies != null && !this.numberOfStudies.isEmpty();
        }

        public boolean hasNumberOfStudies() { 
          return this.numberOfStudies != null && !this.numberOfStudies.isEmpty();
        }

        /**
         * @param value {@link #numberOfStudies} (Number of participants in the population.). This is the underlying object with id, value and extensions. The accessor "getNumberOfStudies" gives direct access to the value
         */
        public StatisticSampleSizeComponent setNumberOfStudiesElement(IntegerType value) { 
          this.numberOfStudies = value;
          return this;
        }

        /**
         * @return Number of participants in the population.
         */
        public int getNumberOfStudies() { 
          return this.numberOfStudies == null || this.numberOfStudies.isEmpty() ? 0 : this.numberOfStudies.getValue();
        }

        /**
         * @param value Number of participants in the population.
         */
        public StatisticSampleSizeComponent setNumberOfStudies(int value) { 
            if (this.numberOfStudies == null)
              this.numberOfStudies = new IntegerType();
            this.numberOfStudies.setValue(value);
          return this;
        }

        /**
         * @return {@link #numberOfParticipants} (A human-readable string to clarify or explain concepts about the sample size.). This is the underlying object with id, value and extensions. The accessor "getNumberOfParticipants" gives direct access to the value
         */
        public IntegerType getNumberOfParticipantsElement() { 
          if (this.numberOfParticipants == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticSampleSizeComponent.numberOfParticipants");
            else if (Configuration.doAutoCreate())
              this.numberOfParticipants = new IntegerType(); // bb
          return this.numberOfParticipants;
        }

        public boolean hasNumberOfParticipantsElement() { 
          return this.numberOfParticipants != null && !this.numberOfParticipants.isEmpty();
        }

        public boolean hasNumberOfParticipants() { 
          return this.numberOfParticipants != null && !this.numberOfParticipants.isEmpty();
        }

        /**
         * @param value {@link #numberOfParticipants} (A human-readable string to clarify or explain concepts about the sample size.). This is the underlying object with id, value and extensions. The accessor "getNumberOfParticipants" gives direct access to the value
         */
        public StatisticSampleSizeComponent setNumberOfParticipantsElement(IntegerType value) { 
          this.numberOfParticipants = value;
          return this;
        }

        /**
         * @return A human-readable string to clarify or explain concepts about the sample size.
         */
        public int getNumberOfParticipants() { 
          return this.numberOfParticipants == null || this.numberOfParticipants.isEmpty() ? 0 : this.numberOfParticipants.getValue();
        }

        /**
         * @param value A human-readable string to clarify or explain concepts about the sample size.
         */
        public StatisticSampleSizeComponent setNumberOfParticipants(int value) { 
            if (this.numberOfParticipants == null)
              this.numberOfParticipants = new IntegerType();
            this.numberOfParticipants.setValue(value);
          return this;
        }

        /**
         * @return {@link #knownDataCount} (TBD.). This is the underlying object with id, value and extensions. The accessor "getKnownDataCount" gives direct access to the value
         */
        public IntegerType getKnownDataCountElement() { 
          if (this.knownDataCount == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticSampleSizeComponent.knownDataCount");
            else if (Configuration.doAutoCreate())
              this.knownDataCount = new IntegerType(); // bb
          return this.knownDataCount;
        }

        public boolean hasKnownDataCountElement() { 
          return this.knownDataCount != null && !this.knownDataCount.isEmpty();
        }

        public boolean hasKnownDataCount() { 
          return this.knownDataCount != null && !this.knownDataCount.isEmpty();
        }

        /**
         * @param value {@link #knownDataCount} (TBD.). This is the underlying object with id, value and extensions. The accessor "getKnownDataCount" gives direct access to the value
         */
        public StatisticSampleSizeComponent setKnownDataCountElement(IntegerType value) { 
          this.knownDataCount = value;
          return this;
        }

        /**
         * @return TBD.
         */
        public int getKnownDataCount() { 
          return this.knownDataCount == null || this.knownDataCount.isEmpty() ? 0 : this.knownDataCount.getValue();
        }

        /**
         * @param value TBD.
         */
        public StatisticSampleSizeComponent setKnownDataCount(int value) { 
            if (this.knownDataCount == null)
              this.knownDataCount = new IntegerType();
            this.knownDataCount.setValue(value);
          return this;
        }

        /**
         * @return {@link #numeratorCount} (TBD.). This is the underlying object with id, value and extensions. The accessor "getNumeratorCount" gives direct access to the value
         */
        public IntegerType getNumeratorCountElement() { 
          if (this.numeratorCount == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticSampleSizeComponent.numeratorCount");
            else if (Configuration.doAutoCreate())
              this.numeratorCount = new IntegerType(); // bb
          return this.numeratorCount;
        }

        public boolean hasNumeratorCountElement() { 
          return this.numeratorCount != null && !this.numeratorCount.isEmpty();
        }

        public boolean hasNumeratorCount() { 
          return this.numeratorCount != null && !this.numeratorCount.isEmpty();
        }

        /**
         * @param value {@link #numeratorCount} (TBD.). This is the underlying object with id, value and extensions. The accessor "getNumeratorCount" gives direct access to the value
         */
        public StatisticSampleSizeComponent setNumeratorCountElement(IntegerType value) { 
          this.numeratorCount = value;
          return this;
        }

        /**
         * @return TBD.
         */
        public int getNumeratorCount() { 
          return this.numeratorCount == null || this.numeratorCount.isEmpty() ? 0 : this.numeratorCount.getValue();
        }

        /**
         * @param value TBD.
         */
        public StatisticSampleSizeComponent setNumeratorCount(int value) { 
            if (this.numeratorCount == null)
              this.numeratorCount = new IntegerType();
            this.numeratorCount.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of population sample size.", 0, 1, description));
          children.add(new Property("note", "Annotation", "Footnote or explanatory note about the sample size.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("numberOfStudies", "integer", "Number of participants in the population.", 0, 1, numberOfStudies));
          children.add(new Property("numberOfParticipants", "integer", "A human-readable string to clarify or explain concepts about the sample size.", 0, 1, numberOfParticipants));
          children.add(new Property("knownDataCount", "integer", "TBD.", 0, 1, knownDataCount));
          children.add(new Property("numeratorCount", "integer", "TBD.", 0, 1, numeratorCount));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of population sample size.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Footnote or explanatory note about the sample size.", 0, java.lang.Integer.MAX_VALUE, note);
          case -177467129: /*numberOfStudies*/  return new Property("numberOfStudies", "integer", "Number of participants in the population.", 0, 1, numberOfStudies);
          case 1799357120: /*numberOfParticipants*/  return new Property("numberOfParticipants", "integer", "A human-readable string to clarify or explain concepts about the sample size.", 0, 1, numberOfParticipants);
          case -937344126: /*knownDataCount*/  return new Property("knownDataCount", "integer", "TBD.", 0, 1, knownDataCount);
          case -755509242: /*numeratorCount*/  return new Property("numeratorCount", "integer", "TBD.", 0, 1, numeratorCount);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case -177467129: /*numberOfStudies*/ return this.numberOfStudies == null ? new Base[0] : new Base[] {this.numberOfStudies}; // IntegerType
        case 1799357120: /*numberOfParticipants*/ return this.numberOfParticipants == null ? new Base[0] : new Base[] {this.numberOfParticipants}; // IntegerType
        case -937344126: /*knownDataCount*/ return this.knownDataCount == null ? new Base[0] : new Base[] {this.knownDataCount}; // IntegerType
        case -755509242: /*numeratorCount*/ return this.numeratorCount == null ? new Base[0] : new Base[] {this.numeratorCount}; // IntegerType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case -177467129: // numberOfStudies
          this.numberOfStudies = castToInteger(value); // IntegerType
          return value;
        case 1799357120: // numberOfParticipants
          this.numberOfParticipants = castToInteger(value); // IntegerType
          return value;
        case -937344126: // knownDataCount
          this.knownDataCount = castToInteger(value); // IntegerType
          return value;
        case -755509242: // numeratorCount
          this.numeratorCount = castToInteger(value); // IntegerType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("numberOfStudies")) {
          this.numberOfStudies = castToInteger(value); // IntegerType
        } else if (name.equals("numberOfParticipants")) {
          this.numberOfParticipants = castToInteger(value); // IntegerType
        } else if (name.equals("knownDataCount")) {
          this.knownDataCount = castToInteger(value); // IntegerType
        } else if (name.equals("numeratorCount")) {
          this.numeratorCount = castToInteger(value); // IntegerType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case -177467129:  return getNumberOfStudiesElement();
        case 1799357120:  return getNumberOfParticipantsElement();
        case -937344126:  return getKnownDataCountElement();
        case -755509242:  return getNumeratorCountElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -177467129: /*numberOfStudies*/ return new String[] {"integer"};
        case 1799357120: /*numberOfParticipants*/ return new String[] {"integer"};
        case -937344126: /*knownDataCount*/ return new String[] {"integer"};
        case -755509242: /*numeratorCount*/ return new String[] {"integer"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("numberOfStudies")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.numberOfStudies");
        }
        else if (name.equals("numberOfParticipants")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.numberOfParticipants");
        }
        else if (name.equals("knownDataCount")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.knownDataCount");
        }
        else if (name.equals("numeratorCount")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.numeratorCount");
        }
        else
          return super.addChild(name);
      }

      public StatisticSampleSizeComponent copy() {
        StatisticSampleSizeComponent dst = new StatisticSampleSizeComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(StatisticSampleSizeComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.numberOfStudies = numberOfStudies == null ? null : numberOfStudies.copy();
        dst.numberOfParticipants = numberOfParticipants == null ? null : numberOfParticipants.copy();
        dst.knownDataCount = knownDataCount == null ? null : knownDataCount.copy();
        dst.numeratorCount = numeratorCount == null ? null : numeratorCount.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof StatisticSampleSizeComponent))
          return false;
        StatisticSampleSizeComponent o = (StatisticSampleSizeComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(numberOfStudies, o.numberOfStudies, true)
           && compareDeep(numberOfParticipants, o.numberOfParticipants, true) && compareDeep(knownDataCount, o.knownDataCount, true)
           && compareDeep(numeratorCount, o.numeratorCount, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof StatisticSampleSizeComponent))
          return false;
        StatisticSampleSizeComponent o = (StatisticSampleSizeComponent) other_;
        return compareValues(description, o.description, true) && compareValues(numberOfStudies, o.numberOfStudies, true)
           && compareValues(numberOfParticipants, o.numberOfParticipants, true) && compareValues(knownDataCount, o.knownDataCount, true)
           && compareValues(numeratorCount, o.numeratorCount, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, numberOfStudies
          , numberOfParticipants, knownDataCount, numeratorCount);
      }

  public String fhirType() {
    return "Statistic.sampleSize";

  }

  }

    @Block()
    public static class StatisticPrecisionEstimateComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of the estimate.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of the estimate", formalDefinition="Human-readable summary of the estimate." )
        protected StringType description;

        /**
         * Footnote or explanatory note about the estimate.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnote or explanatory note about the estimate", formalDefinition="Footnote or explanatory note about the estimate." )
        protected List<Annotation> note;

        /**
         * The estimate type.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="The estimate type", formalDefinition="The estimate type." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/precision-estimate-type")
        protected CodeableConcept type;

        /**
         * Use 95 for a 95% confidence interval.
         */
        @Child(name = "level", type = {DecimalType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Level of confidence interval", formalDefinition="Use 95 for a 95% confidence interval." )
        protected DecimalType level;

        /**
         * Lower bound of confidence interval.
         */
        @Child(name = "from", type = {DecimalType.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Lower bound", formalDefinition="Lower bound of confidence interval." )
        protected DecimalType from;

        /**
         * Upper bound of confidence interval.
         */
        @Child(name = "to", type = {DecimalType.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Upper bound", formalDefinition="Upper bound of confidence interval." )
        protected DecimalType to;

        private static final long serialVersionUID = -1548589169L;

    /**
     * Constructor
     */
      public StatisticPrecisionEstimateComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human-readable summary of the estimate.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPrecisionEstimateComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Human-readable summary of the estimate.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StatisticPrecisionEstimateComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of the estimate.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of the estimate.
         */
        public StatisticPrecisionEstimateComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (Footnote or explanatory note about the estimate.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticPrecisionEstimateComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public StatisticPrecisionEstimateComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #type} (The estimate type.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPrecisionEstimateComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (The estimate type.)
         */
        public StatisticPrecisionEstimateComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #level} (Use 95 for a 95% confidence interval.). This is the underlying object with id, value and extensions. The accessor "getLevel" gives direct access to the value
         */
        public DecimalType getLevelElement() { 
          if (this.level == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPrecisionEstimateComponent.level");
            else if (Configuration.doAutoCreate())
              this.level = new DecimalType(); // bb
          return this.level;
        }

        public boolean hasLevelElement() { 
          return this.level != null && !this.level.isEmpty();
        }

        public boolean hasLevel() { 
          return this.level != null && !this.level.isEmpty();
        }

        /**
         * @param value {@link #level} (Use 95 for a 95% confidence interval.). This is the underlying object with id, value and extensions. The accessor "getLevel" gives direct access to the value
         */
        public StatisticPrecisionEstimateComponent setLevelElement(DecimalType value) { 
          this.level = value;
          return this;
        }

        /**
         * @return Use 95 for a 95% confidence interval.
         */
        public BigDecimal getLevel() { 
          return this.level == null ? null : this.level.getValue();
        }

        /**
         * @param value Use 95 for a 95% confidence interval.
         */
        public StatisticPrecisionEstimateComponent setLevel(BigDecimal value) { 
          if (value == null)
            this.level = null;
          else {
            if (this.level == null)
              this.level = new DecimalType();
            this.level.setValue(value);
          }
          return this;
        }

        /**
         * @param value Use 95 for a 95% confidence interval.
         */
        public StatisticPrecisionEstimateComponent setLevel(long value) { 
              this.level = new DecimalType();
            this.level.setValue(value);
          return this;
        }

        /**
         * @param value Use 95 for a 95% confidence interval.
         */
        public StatisticPrecisionEstimateComponent setLevel(double value) { 
              this.level = new DecimalType();
            this.level.setValue(value);
          return this;
        }

        /**
         * @return {@link #from} (Lower bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getFrom" gives direct access to the value
         */
        public DecimalType getFromElement() { 
          if (this.from == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPrecisionEstimateComponent.from");
            else if (Configuration.doAutoCreate())
              this.from = new DecimalType(); // bb
          return this.from;
        }

        public boolean hasFromElement() { 
          return this.from != null && !this.from.isEmpty();
        }

        public boolean hasFrom() { 
          return this.from != null && !this.from.isEmpty();
        }

        /**
         * @param value {@link #from} (Lower bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getFrom" gives direct access to the value
         */
        public StatisticPrecisionEstimateComponent setFromElement(DecimalType value) { 
          this.from = value;
          return this;
        }

        /**
         * @return Lower bound of confidence interval.
         */
        public BigDecimal getFrom() { 
          return this.from == null ? null : this.from.getValue();
        }

        /**
         * @param value Lower bound of confidence interval.
         */
        public StatisticPrecisionEstimateComponent setFrom(BigDecimal value) { 
          if (value == null)
            this.from = null;
          else {
            if (this.from == null)
              this.from = new DecimalType();
            this.from.setValue(value);
          }
          return this;
        }

        /**
         * @param value Lower bound of confidence interval.
         */
        public StatisticPrecisionEstimateComponent setFrom(long value) { 
              this.from = new DecimalType();
            this.from.setValue(value);
          return this;
        }

        /**
         * @param value Lower bound of confidence interval.
         */
        public StatisticPrecisionEstimateComponent setFrom(double value) { 
              this.from = new DecimalType();
            this.from.setValue(value);
          return this;
        }

        /**
         * @return {@link #to} (Upper bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getTo" gives direct access to the value
         */
        public DecimalType getToElement() { 
          if (this.to == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPrecisionEstimateComponent.to");
            else if (Configuration.doAutoCreate())
              this.to = new DecimalType(); // bb
          return this.to;
        }

        public boolean hasToElement() { 
          return this.to != null && !this.to.isEmpty();
        }

        public boolean hasTo() { 
          return this.to != null && !this.to.isEmpty();
        }

        /**
         * @param value {@link #to} (Upper bound of confidence interval.). This is the underlying object with id, value and extensions. The accessor "getTo" gives direct access to the value
         */
        public StatisticPrecisionEstimateComponent setToElement(DecimalType value) { 
          this.to = value;
          return this;
        }

        /**
         * @return Upper bound of confidence interval.
         */
        public BigDecimal getTo() { 
          return this.to == null ? null : this.to.getValue();
        }

        /**
         * @param value Upper bound of confidence interval.
         */
        public StatisticPrecisionEstimateComponent setTo(BigDecimal value) { 
          if (value == null)
            this.to = null;
          else {
            if (this.to == null)
              this.to = new DecimalType();
            this.to.setValue(value);
          }
          return this;
        }

        /**
         * @param value Upper bound of confidence interval.
         */
        public StatisticPrecisionEstimateComponent setTo(long value) { 
              this.to = new DecimalType();
            this.to.setValue(value);
          return this;
        }

        /**
         * @param value Upper bound of confidence interval.
         */
        public StatisticPrecisionEstimateComponent setTo(double value) { 
              this.to = new DecimalType();
            this.to.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of the estimate.", 0, 1, description));
          children.add(new Property("note", "Annotation", "Footnote or explanatory note about the estimate.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("type", "CodeableConcept", "The estimate type.", 0, 1, type));
          children.add(new Property("level", "decimal", "Use 95 for a 95% confidence interval.", 0, 1, level));
          children.add(new Property("from", "decimal", "Lower bound of confidence interval.", 0, 1, from));
          children.add(new Property("to", "decimal", "Upper bound of confidence interval.", 0, 1, to));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of the estimate.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Footnote or explanatory note about the estimate.", 0, java.lang.Integer.MAX_VALUE, note);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "The estimate type.", 0, 1, type);
          case 102865796: /*level*/  return new Property("level", "decimal", "Use 95 for a 95% confidence interval.", 0, 1, level);
          case 3151786: /*from*/  return new Property("from", "decimal", "Lower bound of confidence interval.", 0, 1, from);
          case 3707: /*to*/  return new Property("to", "decimal", "Upper bound of confidence interval.", 0, 1, to);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 102865796: /*level*/ return this.level == null ? new Base[0] : new Base[] {this.level}; // DecimalType
        case 3151786: /*from*/ return this.from == null ? new Base[0] : new Base[] {this.from}; // DecimalType
        case 3707: /*to*/ return this.to == null ? new Base[0] : new Base[] {this.to}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 102865796: // level
          this.level = castToDecimal(value); // DecimalType
          return value;
        case 3151786: // from
          this.from = castToDecimal(value); // DecimalType
          return value;
        case 3707: // to
          this.to = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("level")) {
          this.level = castToDecimal(value); // DecimalType
        } else if (name.equals("from")) {
          this.from = castToDecimal(value); // DecimalType
        } else if (name.equals("to")) {
          this.to = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case 3575610:  return getType(); 
        case 102865796:  return getLevelElement();
        case 3151786:  return getFromElement();
        case 3707:  return getToElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 102865796: /*level*/ return new String[] {"decimal"};
        case 3151786: /*from*/ return new String[] {"decimal"};
        case 3707: /*to*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("level")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.level");
        }
        else if (name.equals("from")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.from");
        }
        else if (name.equals("to")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.to");
        }
        else
          return super.addChild(name);
      }

      public StatisticPrecisionEstimateComponent copy() {
        StatisticPrecisionEstimateComponent dst = new StatisticPrecisionEstimateComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(StatisticPrecisionEstimateComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.level = level == null ? null : level.copy();
        dst.from = from == null ? null : from.copy();
        dst.to = to == null ? null : to.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof StatisticPrecisionEstimateComponent))
          return false;
        StatisticPrecisionEstimateComponent o = (StatisticPrecisionEstimateComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(type, o.type, true)
           && compareDeep(level, o.level, true) && compareDeep(from, o.from, true) && compareDeep(to, o.to, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof StatisticPrecisionEstimateComponent))
          return false;
        StatisticPrecisionEstimateComponent o = (StatisticPrecisionEstimateComponent) other_;
        return compareValues(description, o.description, true) && compareValues(level, o.level, true) && compareValues(from, o.from, true)
           && compareValues(to, o.to, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, type
          , level, from, to);
      }

  public String fhirType() {
    return "Statistic.precisionEstimate";

  }

  }

    @Block()
    public static class StatisticPValueComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of the estimate.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of the pValue", formalDefinition="Human-readable summary of the estimate." )
        protected StringType description;

        /**
         * Footnote or explanatory note about the p value.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnote or explanatory note about the p value", formalDefinition="Footnote or explanatory note about the p value." )
        protected List<Annotation> note;

        /**
         * TBD.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="TBD", formalDefinition="TBD." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/pvalue-type")
        protected CodeableConcept type;

        /**
         * Actual p value.
         */
        @Child(name = "quantity", type = {Quantity.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Actual p value", formalDefinition="Actual p value." )
        protected Quantity quantity;

        /**
         * TBD.
         */
        @Child(name = "range", type = {Range.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="TBD", formalDefinition="TBD." )
        protected Range range;

        private static final long serialVersionUID = 1661965663L;

    /**
     * Constructor
     */
      public StatisticPValueComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human-readable summary of the estimate.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPValueComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Human-readable summary of the estimate.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StatisticPValueComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of the estimate.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of the estimate.
         */
        public StatisticPValueComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (Footnote or explanatory note about the p value.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticPValueComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public StatisticPValueComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #type} (TBD.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPValueComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (TBD.)
         */
        public StatisticPValueComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #quantity} (Actual p value.)
         */
        public Quantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPValueComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new Quantity(); // cc
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (Actual p value.)
         */
        public StatisticPValueComponent setQuantity(Quantity value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #range} (TBD.)
         */
        public Range getRange() { 
          if (this.range == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticPValueComponent.range");
            else if (Configuration.doAutoCreate())
              this.range = new Range(); // cc
          return this.range;
        }

        public boolean hasRange() { 
          return this.range != null && !this.range.isEmpty();
        }

        /**
         * @param value {@link #range} (TBD.)
         */
        public StatisticPValueComponent setRange(Range value) { 
          this.range = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of the estimate.", 0, 1, description));
          children.add(new Property("note", "Annotation", "Footnote or explanatory note about the p value.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("type", "CodeableConcept", "TBD.", 0, 1, type));
          children.add(new Property("quantity", "Quantity", "Actual p value.", 0, 1, quantity));
          children.add(new Property("range", "Range", "TBD.", 0, 1, range));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of the estimate.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "Footnote or explanatory note about the p value.", 0, java.lang.Integer.MAX_VALUE, note);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "TBD.", 0, 1, type);
          case -1285004149: /*quantity*/  return new Property("quantity", "Quantity", "Actual p value.", 0, 1, quantity);
          case 108280125: /*range*/  return new Property("range", "Range", "TBD.", 0, 1, range);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // Quantity
        case 108280125: /*range*/ return this.range == null ? new Base[0] : new Base[] {this.range}; // Range
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case 3575610: // type
          this.type = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1285004149: // quantity
          this.quantity = castToQuantity(value); // Quantity
          return value;
        case 108280125: // range
          this.range = castToRange(value); // Range
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("type")) {
          this.type = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("quantity")) {
          this.quantity = castToQuantity(value); // Quantity
        } else if (name.equals("range")) {
          this.range = castToRange(value); // Range
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case 3575610:  return getType(); 
        case -1285004149:  return getQuantity(); 
        case 108280125:  return getRange(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -1285004149: /*quantity*/ return new String[] {"Quantity"};
        case 108280125: /*range*/ return new String[] {"Range"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("quantity")) {
          this.quantity = new Quantity();
          return this.quantity;
        }
        else if (name.equals("range")) {
          this.range = new Range();
          return this.range;
        }
        else
          return super.addChild(name);
      }

      public StatisticPValueComponent copy() {
        StatisticPValueComponent dst = new StatisticPValueComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(StatisticPValueComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.type = type == null ? null : type.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.range = range == null ? null : range.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof StatisticPValueComponent))
          return false;
        StatisticPValueComponent o = (StatisticPValueComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(type, o.type, true)
           && compareDeep(quantity, o.quantity, true) && compareDeep(range, o.range, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof StatisticPValueComponent))
          return false;
        StatisticPValueComponent o = (StatisticPValueComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, type
          , quantity, range);
      }

  public String fhirType() {
    return "Statistic.pValue";

  }

  }

    @Block()
    public static class StatisticCertaintyComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of the certainty.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of the certainty", formalDefinition="Human-readable summary of the certainty." )
        protected StringType description;

        /**
         * A human-readable string to clarify or explain concepts about the resource.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnote or explanatory note about the statistic certainty", formalDefinition="A human-readable string to clarify or explain concepts about the resource." )
        protected List<Annotation> note;

        /**
         * A rating of the certainty of the effect estimate.
         */
        @Child(name = "rating", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Certainty rating", formalDefinition="A rating of the certainty of the effect estimate." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-rating")
        protected List<CodeableConcept> rating;

        /**
         * A description of a component of the overall certainty.
         */
        @Child(name = "certaintySubcomponent", type = {}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="A component that contributes to the overall certainty", formalDefinition="A description of a component of the overall certainty." )
        protected List<StatisticCertaintyCertaintySubcomponentComponent> certaintySubcomponent;

        private static final long serialVersionUID = -1978001194L;

    /**
     * Constructor
     */
      public StatisticCertaintyComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human-readable summary of the certainty.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticCertaintyComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Human-readable summary of the certainty.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StatisticCertaintyComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of the certainty.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of the certainty.
         */
        public StatisticCertaintyComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (A human-readable string to clarify or explain concepts about the resource.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticCertaintyComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public StatisticCertaintyComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #rating} (A rating of the certainty of the effect estimate.)
         */
        public List<CodeableConcept> getRating() { 
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          return this.rating;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticCertaintyComponent setRating(List<CodeableConcept> theRating) { 
          this.rating = theRating;
          return this;
        }

        public boolean hasRating() { 
          if (this.rating == null)
            return false;
          for (CodeableConcept item : this.rating)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRating() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return t;
        }

        public StatisticCertaintyComponent addRating(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #rating}, creating it if it does not already exist
         */
        public CodeableConcept getRatingFirstRep() { 
          if (getRating().isEmpty()) {
            addRating();
          }
          return getRating().get(0);
        }

        /**
         * @return {@link #certaintySubcomponent} (A description of a component of the overall certainty.)
         */
        public List<StatisticCertaintyCertaintySubcomponentComponent> getCertaintySubcomponent() { 
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<StatisticCertaintyCertaintySubcomponentComponent>();
          return this.certaintySubcomponent;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticCertaintyComponent setCertaintySubcomponent(List<StatisticCertaintyCertaintySubcomponentComponent> theCertaintySubcomponent) { 
          this.certaintySubcomponent = theCertaintySubcomponent;
          return this;
        }

        public boolean hasCertaintySubcomponent() { 
          if (this.certaintySubcomponent == null)
            return false;
          for (StatisticCertaintyCertaintySubcomponentComponent item : this.certaintySubcomponent)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public StatisticCertaintyCertaintySubcomponentComponent addCertaintySubcomponent() { //3
          StatisticCertaintyCertaintySubcomponentComponent t = new StatisticCertaintyCertaintySubcomponentComponent();
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<StatisticCertaintyCertaintySubcomponentComponent>();
          this.certaintySubcomponent.add(t);
          return t;
        }

        public StatisticCertaintyComponent addCertaintySubcomponent(StatisticCertaintyCertaintySubcomponentComponent t) { //3
          if (t == null)
            return this;
          if (this.certaintySubcomponent == null)
            this.certaintySubcomponent = new ArrayList<StatisticCertaintyCertaintySubcomponentComponent>();
          this.certaintySubcomponent.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #certaintySubcomponent}, creating it if it does not already exist
         */
        public StatisticCertaintyCertaintySubcomponentComponent getCertaintySubcomponentFirstRep() { 
          if (getCertaintySubcomponent().isEmpty()) {
            addCertaintySubcomponent();
          }
          return getCertaintySubcomponent().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of the certainty.", 0, 1, description));
          children.add(new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("rating", "CodeableConcept", "A rating of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, rating));
          children.add(new Property("certaintySubcomponent", "", "A description of a component of the overall certainty.", 0, java.lang.Integer.MAX_VALUE, certaintySubcomponent));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of the certainty.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note);
          case -938102371: /*rating*/  return new Property("rating", "CodeableConcept", "A rating of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, rating);
          case 1806398212: /*certaintySubcomponent*/  return new Property("certaintySubcomponent", "", "A description of a component of the overall certainty.", 0, java.lang.Integer.MAX_VALUE, certaintySubcomponent);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case -938102371: /*rating*/ return this.rating == null ? new Base[0] : this.rating.toArray(new Base[this.rating.size()]); // CodeableConcept
        case 1806398212: /*certaintySubcomponent*/ return this.certaintySubcomponent == null ? new Base[0] : this.certaintySubcomponent.toArray(new Base[this.certaintySubcomponent.size()]); // StatisticCertaintyCertaintySubcomponentComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case -938102371: // rating
          this.getRating().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 1806398212: // certaintySubcomponent
          this.getCertaintySubcomponent().add((StatisticCertaintyCertaintySubcomponentComponent) value); // StatisticCertaintyCertaintySubcomponentComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("rating")) {
          this.getRating().add(castToCodeableConcept(value));
        } else if (name.equals("certaintySubcomponent")) {
          this.getCertaintySubcomponent().add((StatisticCertaintyCertaintySubcomponentComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case -938102371:  return addRating(); 
        case 1806398212:  return addCertaintySubcomponent(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case -938102371: /*rating*/ return new String[] {"CodeableConcept"};
        case 1806398212: /*certaintySubcomponent*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("rating")) {
          return addRating();
        }
        else if (name.equals("certaintySubcomponent")) {
          return addCertaintySubcomponent();
        }
        else
          return super.addChild(name);
      }

      public StatisticCertaintyComponent copy() {
        StatisticCertaintyComponent dst = new StatisticCertaintyComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(StatisticCertaintyComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (rating != null) {
          dst.rating = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : rating)
            dst.rating.add(i.copy());
        };
        if (certaintySubcomponent != null) {
          dst.certaintySubcomponent = new ArrayList<StatisticCertaintyCertaintySubcomponentComponent>();
          for (StatisticCertaintyCertaintySubcomponentComponent i : certaintySubcomponent)
            dst.certaintySubcomponent.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof StatisticCertaintyComponent))
          return false;
        StatisticCertaintyComponent o = (StatisticCertaintyComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(rating, o.rating, true)
           && compareDeep(certaintySubcomponent, o.certaintySubcomponent, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof StatisticCertaintyComponent))
          return false;
        StatisticCertaintyComponent o = (StatisticCertaintyComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, rating
          , certaintySubcomponent);
      }

  public String fhirType() {
    return "Statistic.certainty";

  }

  }

    @Block()
    public static class StatisticCertaintyCertaintySubcomponentComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Human-readable summary of the subcomponent.
         */
        @Child(name = "description", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Textual description of the subcomponent", formalDefinition="Human-readable summary of the subcomponent." )
        protected StringType description;

        /**
         * A human-readable string to clarify or explain concepts about the resource.
         */
        @Child(name = "note", type = {Annotation.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Footnote or explanatory note about the statistic certainty subcomponent", formalDefinition="A human-readable string to clarify or explain concepts about the resource." )
        protected List<Annotation> note;

        /**
         * Type of subcomponent of certainty rating.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Type of subcomponent of certainty rating", formalDefinition="Type of subcomponent of certainty rating." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-subcomponent-type")
        protected List<CodeableConcept> type;

        /**
         * A rating of a subcomponent of rating certainty.
         */
        @Child(name = "rating", type = {CodeableConcept.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Subcomponent certainty rating", formalDefinition="A rating of a subcomponent of rating certainty." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/certainty-subcomponent-rating")
        protected List<CodeableConcept> rating;

        private static final long serialVersionUID = 619041733L;

    /**
     * Constructor
     */
      public StatisticCertaintyCertaintySubcomponentComponent() {
        super();
      }

        /**
         * @return {@link #description} (Human-readable summary of the subcomponent.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StringType getDescriptionElement() { 
          if (this.description == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create StatisticCertaintyCertaintySubcomponentComponent.description");
            else if (Configuration.doAutoCreate())
              this.description = new StringType(); // bb
          return this.description;
        }

        public boolean hasDescriptionElement() { 
          return this.description != null && !this.description.isEmpty();
        }

        public boolean hasDescription() { 
          return this.description != null && !this.description.isEmpty();
        }

        /**
         * @param value {@link #description} (Human-readable summary of the subcomponent.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
         */
        public StatisticCertaintyCertaintySubcomponentComponent setDescriptionElement(StringType value) { 
          this.description = value;
          return this;
        }

        /**
         * @return Human-readable summary of the subcomponent.
         */
        public String getDescription() { 
          return this.description == null ? null : this.description.getValue();
        }

        /**
         * @param value Human-readable summary of the subcomponent.
         */
        public StatisticCertaintyCertaintySubcomponentComponent setDescription(String value) { 
          if (Utilities.noString(value))
            this.description = null;
          else {
            if (this.description == null)
              this.description = new StringType();
            this.description.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #note} (A human-readable string to clarify or explain concepts about the resource.)
         */
        public List<Annotation> getNote() { 
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          return this.note;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticCertaintyCertaintySubcomponentComponent setNote(List<Annotation> theNote) { 
          this.note = theNote;
          return this;
        }

        public boolean hasNote() { 
          if (this.note == null)
            return false;
          for (Annotation item : this.note)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Annotation addNote() { //3
          Annotation t = new Annotation();
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return t;
        }

        public StatisticCertaintyCertaintySubcomponentComponent addNote(Annotation t) { //3
          if (t == null)
            return this;
          if (this.note == null)
            this.note = new ArrayList<Annotation>();
          this.note.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
         */
        public Annotation getNoteFirstRep() { 
          if (getNote().isEmpty()) {
            addNote();
          }
          return getNote().get(0);
        }

        /**
         * @return {@link #type} (Type of subcomponent of certainty rating.)
         */
        public List<CodeableConcept> getType() { 
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          return this.type;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticCertaintyCertaintySubcomponentComponent setType(List<CodeableConcept> theType) { 
          this.type = theType;
          return this;
        }

        public boolean hasType() { 
          if (this.type == null)
            return false;
          for (CodeableConcept item : this.type)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addType() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          this.type.add(t);
          return t;
        }

        public StatisticCertaintyCertaintySubcomponentComponent addType(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.type == null)
            this.type = new ArrayList<CodeableConcept>();
          this.type.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #type}, creating it if it does not already exist
         */
        public CodeableConcept getTypeFirstRep() { 
          if (getType().isEmpty()) {
            addType();
          }
          return getType().get(0);
        }

        /**
         * @return {@link #rating} (A rating of a subcomponent of rating certainty.)
         */
        public List<CodeableConcept> getRating() { 
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          return this.rating;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public StatisticCertaintyCertaintySubcomponentComponent setRating(List<CodeableConcept> theRating) { 
          this.rating = theRating;
          return this;
        }

        public boolean hasRating() { 
          if (this.rating == null)
            return false;
          for (CodeableConcept item : this.rating)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRating() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return t;
        }

        public StatisticCertaintyCertaintySubcomponentComponent addRating(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.rating == null)
            this.rating = new ArrayList<CodeableConcept>();
          this.rating.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #rating}, creating it if it does not already exist
         */
        public CodeableConcept getRatingFirstRep() { 
          if (getRating().isEmpty()) {
            addRating();
          }
          return getRating().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("description", "string", "Human-readable summary of the subcomponent.", 0, 1, description));
          children.add(new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note));
          children.add(new Property("type", "CodeableConcept", "Type of subcomponent of certainty rating.", 0, java.lang.Integer.MAX_VALUE, type));
          children.add(new Property("rating", "CodeableConcept", "A rating of a subcomponent of rating certainty.", 0, java.lang.Integer.MAX_VALUE, rating));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1724546052: /*description*/  return new Property("description", "string", "Human-readable summary of the subcomponent.", 0, 1, description);
          case 3387378: /*note*/  return new Property("note", "Annotation", "A human-readable string to clarify or explain concepts about the resource.", 0, java.lang.Integer.MAX_VALUE, note);
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "Type of subcomponent of certainty rating.", 0, java.lang.Integer.MAX_VALUE, type);
          case -938102371: /*rating*/  return new Property("rating", "CodeableConcept", "A rating of a subcomponent of rating certainty.", 0, java.lang.Integer.MAX_VALUE, rating);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // StringType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 3575610: /*type*/ return this.type == null ? new Base[0] : this.type.toArray(new Base[this.type.size()]); // CodeableConcept
        case -938102371: /*rating*/ return this.rating == null ? new Base[0] : this.rating.toArray(new Base[this.rating.size()]); // CodeableConcept
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1724546052: // description
          this.description = castToString(value); // StringType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case 3575610: // type
          this.getType().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -938102371: // rating
          this.getRating().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("description")) {
          this.description = castToString(value); // StringType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("type")) {
          this.getType().add(castToCodeableConcept(value));
        } else if (name.equals("rating")) {
          this.getRating().add(castToCodeableConcept(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case 3575610:  return addType(); 
        case -938102371:  return addRating(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1724546052: /*description*/ return new String[] {"string"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case -938102371: /*rating*/ return new String[] {"CodeableConcept"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("type")) {
          return addType();
        }
        else if (name.equals("rating")) {
          return addRating();
        }
        else
          return super.addChild(name);
      }

      public StatisticCertaintyCertaintySubcomponentComponent copy() {
        StatisticCertaintyCertaintySubcomponentComponent dst = new StatisticCertaintyCertaintySubcomponentComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(StatisticCertaintyCertaintySubcomponentComponent dst) {
        super.copyValues(dst);
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        if (type != null) {
          dst.type = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : type)
            dst.type.add(i.copy());
        };
        if (rating != null) {
          dst.rating = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : rating)
            dst.rating.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof StatisticCertaintyCertaintySubcomponentComponent))
          return false;
        StatisticCertaintyCertaintySubcomponentComponent o = (StatisticCertaintyCertaintySubcomponentComponent) other_;
        return compareDeep(description, o.description, true) && compareDeep(note, o.note, true) && compareDeep(type, o.type, true)
           && compareDeep(rating, o.rating, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof StatisticCertaintyCertaintySubcomponentComponent))
          return false;
        StatisticCertaintyCertaintySubcomponentComponent o = (StatisticCertaintyCertaintySubcomponentComponent) other_;
        return compareValues(description, o.description, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(description, note, type
          , rating);
      }

  public String fhirType() {
    return "Statistic.certainty.certaintySubcomponent";

  }

  }

    /**
     * A formal identifier that is used to identify this statistic when it is represented in other formats, or referenced in a specification, model, design or an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Additional identifier for the statistic", formalDefinition="A formal identifier that is used to identify this statistic when it is represented in other formats, or referenced in a specification, model, design or an instance." )
    protected List<Identifier> identifier;

    /**
     * The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    @Child(name = "approvalDate", type = {DateType.class}, order=1, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When the statistic was approved by publisher", formalDefinition="The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage." )
    protected DateType approvalDate;

    /**
     * The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    @Child(name = "lastReviewDate", type = {DateType.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="When the statistic was last reviewed", formalDefinition="The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date." )
    protected DateType lastReviewDate;

    /**
     * The individual or organization that produced this statistic.
     */
    @Child(name = "statisticPublisher", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="The individual or organization that produced this statistic", formalDefinition="The individual or organization that produced this statistic." )
    protected List<StatisticStatisticPublisherComponent> statisticPublisher;

    /**
     * Contact detail and role for contributor to statistic.
     */
    @Child(name = "contributor", type = {Contributor.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Contact detail and role for contributor to statistic", formalDefinition="Contact detail and role for contributor to statistic." )
    protected List<Contributor> contributor;

    /**
     * Link to artifact associated with statistic.
     */
    @Child(name = "relatedArtifact", type = {RelatedArtifact.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Link to artifact associated with statistic", formalDefinition="Link to artifact associated with statistic." )
    protected List<RelatedArtifact> relatedArtifact;

    /**
     * Footnotes and/or explanatory notes.
     */
    @Child(name = "note", type = {Annotation.class}, order=6, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Footnotes and/or explanatory notes", formalDefinition="Footnotes and/or explanatory notes." )
    protected List<Annotation> note;

    /**
     * The particular type of synthesis if this is a synthesis statistic.
     */
    @Child(name = "synthesisType", type = {CodeableConcept.class}, order=7, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The particular type of synthesis if this is a synthesis statistic", formalDefinition="The particular type of synthesis if this is a synthesis statistic." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/synthesis-type")
    protected CodeableConcept synthesisType;

    /**
     * The type of study that produced this statistic.
     */
    @Child(name = "studyType", type = {CodeableConcept.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The type of study that produced this statistic", formalDefinition="The type of study that produced this statistic." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/study-type")
    protected CodeableConcept studyType;

    /**
     * TBD.
     */
    @Child(name = "exposureBackground", type = {Group.class}, order=9, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="TBD", formalDefinition="TBD." )
    protected Reference exposureBackground;

    /**
     * The actual object that is the target of the reference (TBD.)
     */
    protected Group exposureBackgroundTarget;

    /**
     * TBD.
     */
    @Child(name = "exposure", type = {Group.class}, order=10, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="TBD", formalDefinition="TBD." )
    protected Reference exposure;

    /**
     * The actual object that is the target of the reference (TBD.)
     */
    protected Group exposureTarget;

    /**
     * Exposure or intervention or exposure state.
     */
    @Child(name = "exposureVariant", type = {Group.class}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Exposure or intervention or exposure state", formalDefinition="Exposure or intervention or exposure state." )
    protected List<Reference> exposureVariant;
    /**
     * The actual objects that are the target of the reference (Exposure or intervention or exposure state.)
     */
    protected List<Group> exposureVariantTarget;


    /**
     * Outcome or characteristic that is measured.
     */
    @Child(name = "measuredVariable", type = {EvidenceVariable.class}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Outcome or characteristic that is measured", formalDefinition="Outcome or characteristic that is measured." )
    protected List<Reference> measuredVariable;
    /**
     * The actual objects that are the target of the reference (Outcome or characteristic that is measured.)
     */
    protected List<EvidenceVariable> measuredVariableTarget;


    /**
     * The effect or risk estimate type.
     */
    @Child(name = "statisticType", type = {CodeableConcept.class}, order=13, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The effect or risk estimate type", formalDefinition="The effect or risk estimate type." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/statistic-type")
    protected CodeableConcept statisticType;

    /**
     * The statistic value.
     */
    @Child(name = "quantity", type = {Quantity.class}, order=14, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="The statistic value", formalDefinition="The statistic value." )
    protected Quantity quantity;

    /**
     * Population sample size.
     */
    @Child(name = "sampleSize", type = {}, order=15, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Population sample size", formalDefinition="Population sample size." )
    protected StatisticSampleSizeComponent sampleSize;

    /**
     * An estimate of the precision of the statistic.
     */
    @Child(name = "precisionEstimate", type = {}, order=16, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="An estimate of the precision of the statistic", formalDefinition="An estimate of the precision of the statistic." )
    protected List<StatisticPrecisionEstimateComponent> precisionEstimate;

    /**
     * The probability that this statistic would be the same given the null hypothesis.
     */
    @Child(name = "pValue", type = {}, order=17, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="The probability that this statistic would be the same given the null hypothesis", formalDefinition="The probability that this statistic would be the same given the null hypothesis." )
    protected List<StatisticPValueComponent> pValue;

    /**
     * A description of the certainty of the effect estimate.
     */
    @Child(name = "certainty", type = {}, order=18, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="How certain is the effect", formalDefinition="A description of the certainty of the effect estimate." )
    protected List<StatisticCertaintyComponent> certainty;

    private static final long serialVersionUID = 1724473899L;

  /**
   * Constructor
   */
    public Statistic() {
      super();
    }

  /**
   * Constructor
   */
    public Statistic(Enumeration<PublicationStatus> status, Reference exposureBackground) {
      super();
      this.status = status;
      this.exposureBackground = exposureBackground;
    }

    /**
     * @return {@link #url} (An absolute URI that is used to identify this statistic when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this statistic is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the statistic is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public UriType getUrlElement() { 
      if (this.url == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.url");
        else if (Configuration.doAutoCreate())
          this.url = new UriType(); // bb
      return this.url;
    }

    public boolean hasUrlElement() { 
      return this.url != null && !this.url.isEmpty();
    }

    public boolean hasUrl() { 
      return this.url != null && !this.url.isEmpty();
    }

    /**
     * @param value {@link #url} (An absolute URI that is used to identify this statistic when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this statistic is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the statistic is stored on different servers.). This is the underlying object with id, value and extensions. The accessor "getUrl" gives direct access to the value
     */
    public Statistic setUrlElement(UriType value) { 
      this.url = value;
      return this;
    }

    /**
     * @return An absolute URI that is used to identify this statistic when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this statistic is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the statistic is stored on different servers.
     */
    public String getUrl() { 
      return this.url == null ? null : this.url.getValue();
    }

    /**
     * @param value An absolute URI that is used to identify this statistic when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this statistic is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the statistic is stored on different servers.
     */
    public Statistic setUrl(String value) { 
      if (Utilities.noString(value))
        this.url = null;
      else {
        if (this.url == null)
          this.url = new UriType();
        this.url.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #identifier} (A formal identifier that is used to identify this statistic when it is represented in other formats, or referenced in a specification, model, design or an instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public Statistic addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #version} (The identifier that is used to identify this version of the statistic when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the statistic author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public StringType getVersionElement() { 
      if (this.version == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.version");
        else if (Configuration.doAutoCreate())
          this.version = new StringType(); // bb
      return this.version;
    }

    public boolean hasVersionElement() { 
      return this.version != null && !this.version.isEmpty();
    }

    public boolean hasVersion() { 
      return this.version != null && !this.version.isEmpty();
    }

    /**
     * @param value {@link #version} (The identifier that is used to identify this version of the statistic when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the statistic author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.). This is the underlying object with id, value and extensions. The accessor "getVersion" gives direct access to the value
     */
    public Statistic setVersionElement(StringType value) { 
      this.version = value;
      return this;
    }

    /**
     * @return The identifier that is used to identify this version of the statistic when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the statistic author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public String getVersion() { 
      return this.version == null ? null : this.version.getValue();
    }

    /**
     * @param value The identifier that is used to identify this version of the statistic when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the statistic author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.
     */
    public Statistic setVersion(String value) { 
      if (Utilities.noString(value))
        this.version = null;
      else {
        if (this.version == null)
          this.version = new StringType();
        this.version.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #title} (A short, descriptive, user-friendly title for the statistic.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public StringType getTitleElement() { 
      if (this.title == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.title");
        else if (Configuration.doAutoCreate())
          this.title = new StringType(); // bb
      return this.title;
    }

    public boolean hasTitleElement() { 
      return this.title != null && !this.title.isEmpty();
    }

    public boolean hasTitle() { 
      return this.title != null && !this.title.isEmpty();
    }

    /**
     * @param value {@link #title} (A short, descriptive, user-friendly title for the statistic.). This is the underlying object with id, value and extensions. The accessor "getTitle" gives direct access to the value
     */
    public Statistic setTitleElement(StringType value) { 
      this.title = value;
      return this;
    }

    /**
     * @return A short, descriptive, user-friendly title for the statistic.
     */
    public String getTitle() { 
      return this.title == null ? null : this.title.getValue();
    }

    /**
     * @param value A short, descriptive, user-friendly title for the statistic.
     */
    public Statistic setTitle(String value) { 
      if (Utilities.noString(value))
        this.title = null;
      else {
        if (this.title == null)
          this.title = new StringType();
        this.title.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #status} (The status of this statistic. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<PublicationStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of this statistic. Enables tracking the life-cycle of the content.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Statistic setStatusElement(Enumeration<PublicationStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of this statistic. Enables tracking the life-cycle of the content.
     */
    public PublicationStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of this statistic. Enables tracking the life-cycle of the content.
     */
    public Statistic setStatus(PublicationStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<PublicationStatus>(new PublicationStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #date} (The date  (and optionally time) when the statistic was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the statistic changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.date");
        else if (Configuration.doAutoCreate())
          this.date = new DateTimeType(); // bb
      return this.date;
    }

    public boolean hasDateElement() { 
      return this.date != null && !this.date.isEmpty();
    }

    public boolean hasDate() { 
      return this.date != null && !this.date.isEmpty();
    }

    /**
     * @param value {@link #date} (The date  (and optionally time) when the statistic was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the statistic changes.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public Statistic setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return The date  (and optionally time) when the statistic was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the statistic changes.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value The date  (and optionally time) when the statistic was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the statistic changes.
     */
    public Statistic setDate(Date value) { 
      if (value == null)
        this.date = null;
      else {
        if (this.date == null)
          this.date = new DateTimeType();
        this.date.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #useContext} (The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.)
     */
    public List<UsageContext> getUseContext() { 
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      return this.useContext;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setUseContext(List<UsageContext> theUseContext) { 
      this.useContext = theUseContext;
      return this;
    }

    public boolean hasUseContext() { 
      if (this.useContext == null)
        return false;
      for (UsageContext item : this.useContext)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public UsageContext addUseContext() { //3
      UsageContext t = new UsageContext();
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return t;
    }

    public Statistic addUseContext(UsageContext t) { //3
      if (t == null)
        return this;
      if (this.useContext == null)
        this.useContext = new ArrayList<UsageContext>();
      this.useContext.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #useContext}, creating it if it does not already exist
     */
    public UsageContext getUseContextFirstRep() { 
      if (getUseContext().isEmpty()) {
        addUseContext();
      }
      return getUseContext().get(0);
    }

    /**
     * @return {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public DateType getApprovalDateElement() { 
      if (this.approvalDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.approvalDate");
        else if (Configuration.doAutoCreate())
          this.approvalDate = new DateType(); // bb
      return this.approvalDate;
    }

    public boolean hasApprovalDateElement() { 
      return this.approvalDate != null && !this.approvalDate.isEmpty();
    }

    public boolean hasApprovalDate() { 
      return this.approvalDate != null && !this.approvalDate.isEmpty();
    }

    /**
     * @param value {@link #approvalDate} (The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.). This is the underlying object with id, value and extensions. The accessor "getApprovalDate" gives direct access to the value
     */
    public Statistic setApprovalDateElement(DateType value) { 
      this.approvalDate = value;
      return this;
    }

    /**
     * @return The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    public Date getApprovalDate() { 
      return this.approvalDate == null ? null : this.approvalDate.getValue();
    }

    /**
     * @param value The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.
     */
    public Statistic setApprovalDate(Date value) { 
      if (value == null)
        this.approvalDate = null;
      else {
        if (this.approvalDate == null)
          this.approvalDate = new DateType();
        this.approvalDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public DateType getLastReviewDateElement() { 
      if (this.lastReviewDate == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.lastReviewDate");
        else if (Configuration.doAutoCreate())
          this.lastReviewDate = new DateType(); // bb
      return this.lastReviewDate;
    }

    public boolean hasLastReviewDateElement() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    public boolean hasLastReviewDate() { 
      return this.lastReviewDate != null && !this.lastReviewDate.isEmpty();
    }

    /**
     * @param value {@link #lastReviewDate} (The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.). This is the underlying object with id, value and extensions. The accessor "getLastReviewDate" gives direct access to the value
     */
    public Statistic setLastReviewDateElement(DateType value) { 
      this.lastReviewDate = value;
      return this;
    }

    /**
     * @return The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    public Date getLastReviewDate() { 
      return this.lastReviewDate == null ? null : this.lastReviewDate.getValue();
    }

    /**
     * @param value The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.
     */
    public Statistic setLastReviewDate(Date value) { 
      if (value == null)
        this.lastReviewDate = null;
      else {
        if (this.lastReviewDate == null)
          this.lastReviewDate = new DateType();
        this.lastReviewDate.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #statisticPublisher} (The individual or organization that produced this statistic.)
     */
    public List<StatisticStatisticPublisherComponent> getStatisticPublisher() { 
      if (this.statisticPublisher == null)
        this.statisticPublisher = new ArrayList<StatisticStatisticPublisherComponent>();
      return this.statisticPublisher;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setStatisticPublisher(List<StatisticStatisticPublisherComponent> theStatisticPublisher) { 
      this.statisticPublisher = theStatisticPublisher;
      return this;
    }

    public boolean hasStatisticPublisher() { 
      if (this.statisticPublisher == null)
        return false;
      for (StatisticStatisticPublisherComponent item : this.statisticPublisher)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public StatisticStatisticPublisherComponent addStatisticPublisher() { //3
      StatisticStatisticPublisherComponent t = new StatisticStatisticPublisherComponent();
      if (this.statisticPublisher == null)
        this.statisticPublisher = new ArrayList<StatisticStatisticPublisherComponent>();
      this.statisticPublisher.add(t);
      return t;
    }

    public Statistic addStatisticPublisher(StatisticStatisticPublisherComponent t) { //3
      if (t == null)
        return this;
      if (this.statisticPublisher == null)
        this.statisticPublisher = new ArrayList<StatisticStatisticPublisherComponent>();
      this.statisticPublisher.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #statisticPublisher}, creating it if it does not already exist
     */
    public StatisticStatisticPublisherComponent getStatisticPublisherFirstRep() { 
      if (getStatisticPublisher().isEmpty()) {
        addStatisticPublisher();
      }
      return getStatisticPublisher().get(0);
    }

    /**
     * @return {@link #contributor} (Contact detail and role for contributor to statistic.)
     */
    public List<Contributor> getContributor() { 
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      return this.contributor;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setContributor(List<Contributor> theContributor) { 
      this.contributor = theContributor;
      return this;
    }

    public boolean hasContributor() { 
      if (this.contributor == null)
        return false;
      for (Contributor item : this.contributor)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Contributor addContributor() { //3
      Contributor t = new Contributor();
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      this.contributor.add(t);
      return t;
    }

    public Statistic addContributor(Contributor t) { //3
      if (t == null)
        return this;
      if (this.contributor == null)
        this.contributor = new ArrayList<Contributor>();
      this.contributor.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #contributor}, creating it if it does not already exist
     */
    public Contributor getContributorFirstRep() { 
      if (getContributor().isEmpty()) {
        addContributor();
      }
      return getContributor().get(0);
    }

    /**
     * @return {@link #relatedArtifact} (Link to artifact associated with statistic.)
     */
    public List<RelatedArtifact> getRelatedArtifact() { 
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      return this.relatedArtifact;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setRelatedArtifact(List<RelatedArtifact> theRelatedArtifact) { 
      this.relatedArtifact = theRelatedArtifact;
      return this;
    }

    public boolean hasRelatedArtifact() { 
      if (this.relatedArtifact == null)
        return false;
      for (RelatedArtifact item : this.relatedArtifact)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public RelatedArtifact addRelatedArtifact() { //3
      RelatedArtifact t = new RelatedArtifact();
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return t;
    }

    public Statistic addRelatedArtifact(RelatedArtifact t) { //3
      if (t == null)
        return this;
      if (this.relatedArtifact == null)
        this.relatedArtifact = new ArrayList<RelatedArtifact>();
      this.relatedArtifact.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #relatedArtifact}, creating it if it does not already exist
     */
    public RelatedArtifact getRelatedArtifactFirstRep() { 
      if (getRelatedArtifact().isEmpty()) {
        addRelatedArtifact();
      }
      return getRelatedArtifact().get(0);
    }

    /**
     * @return {@link #description} (A free text natural language description of the statistic from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public MarkdownType getDescriptionElement() { 
      if (this.description == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.description");
        else if (Configuration.doAutoCreate())
          this.description = new MarkdownType(); // bb
      return this.description;
    }

    public boolean hasDescriptionElement() { 
      return this.description != null && !this.description.isEmpty();
    }

    public boolean hasDescription() { 
      return this.description != null && !this.description.isEmpty();
    }

    /**
     * @param value {@link #description} (A free text natural language description of the statistic from a consumer's perspective.). This is the underlying object with id, value and extensions. The accessor "getDescription" gives direct access to the value
     */
    public Statistic setDescriptionElement(MarkdownType value) { 
      this.description = value;
      return this;
    }

    /**
     * @return A free text natural language description of the statistic from a consumer's perspective.
     */
    public String getDescription() { 
      return this.description == null ? null : this.description.getValue();
    }

    /**
     * @param value A free text natural language description of the statistic from a consumer's perspective.
     */
    public Statistic setDescription(String value) { 
      if (value == null)
        this.description = null;
      else {
        if (this.description == null)
          this.description = new MarkdownType();
        this.description.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #note} (Footnotes and/or explanatory notes.)
     */
    public List<Annotation> getNote() { 
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      return this.note;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setNote(List<Annotation> theNote) { 
      this.note = theNote;
      return this;
    }

    public boolean hasNote() { 
      if (this.note == null)
        return false;
      for (Annotation item : this.note)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Annotation addNote() { //3
      Annotation t = new Annotation();
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return t;
    }

    public Statistic addNote(Annotation t) { //3
      if (t == null)
        return this;
      if (this.note == null)
        this.note = new ArrayList<Annotation>();
      this.note.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #note}, creating it if it does not already exist
     */
    public Annotation getNoteFirstRep() { 
      if (getNote().isEmpty()) {
        addNote();
      }
      return getNote().get(0);
    }

    /**
     * @return {@link #synthesisType} (The particular type of synthesis if this is a synthesis statistic.)
     */
    public CodeableConcept getSynthesisType() { 
      if (this.synthesisType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.synthesisType");
        else if (Configuration.doAutoCreate())
          this.synthesisType = new CodeableConcept(); // cc
      return this.synthesisType;
    }

    public boolean hasSynthesisType() { 
      return this.synthesisType != null && !this.synthesisType.isEmpty();
    }

    /**
     * @param value {@link #synthesisType} (The particular type of synthesis if this is a synthesis statistic.)
     */
    public Statistic setSynthesisType(CodeableConcept value) { 
      this.synthesisType = value;
      return this;
    }

    /**
     * @return {@link #studyType} (The type of study that produced this statistic.)
     */
    public CodeableConcept getStudyType() { 
      if (this.studyType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.studyType");
        else if (Configuration.doAutoCreate())
          this.studyType = new CodeableConcept(); // cc
      return this.studyType;
    }

    public boolean hasStudyType() { 
      return this.studyType != null && !this.studyType.isEmpty();
    }

    /**
     * @param value {@link #studyType} (The type of study that produced this statistic.)
     */
    public Statistic setStudyType(CodeableConcept value) { 
      this.studyType = value;
      return this;
    }

    /**
     * @return {@link #exposureBackground} (TBD.)
     */
    public Reference getExposureBackground() { 
      if (this.exposureBackground == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.exposureBackground");
        else if (Configuration.doAutoCreate())
          this.exposureBackground = new Reference(); // cc
      return this.exposureBackground;
    }

    public boolean hasExposureBackground() { 
      return this.exposureBackground != null && !this.exposureBackground.isEmpty();
    }

    /**
     * @param value {@link #exposureBackground} (TBD.)
     */
    public Statistic setExposureBackground(Reference value) { 
      this.exposureBackground = value;
      return this;
    }

    /**
     * @return {@link #exposureBackground} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (TBD.)
     */
    public Group getExposureBackgroundTarget() { 
      if (this.exposureBackgroundTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.exposureBackground");
        else if (Configuration.doAutoCreate())
          this.exposureBackgroundTarget = new Group(); // aa
      return this.exposureBackgroundTarget;
    }

    /**
     * @param value {@link #exposureBackground} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (TBD.)
     */
    public Statistic setExposureBackgroundTarget(Group value) { 
      this.exposureBackgroundTarget = value;
      return this;
    }

    /**
     * @return {@link #exposure} (TBD.)
     */
    public Reference getExposure() { 
      if (this.exposure == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.exposure");
        else if (Configuration.doAutoCreate())
          this.exposure = new Reference(); // cc
      return this.exposure;
    }

    public boolean hasExposure() { 
      return this.exposure != null && !this.exposure.isEmpty();
    }

    /**
     * @param value {@link #exposure} (TBD.)
     */
    public Statistic setExposure(Reference value) { 
      this.exposure = value;
      return this;
    }

    /**
     * @return {@link #exposure} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (TBD.)
     */
    public Group getExposureTarget() { 
      if (this.exposureTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.exposure");
        else if (Configuration.doAutoCreate())
          this.exposureTarget = new Group(); // aa
      return this.exposureTarget;
    }

    /**
     * @param value {@link #exposure} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (TBD.)
     */
    public Statistic setExposureTarget(Group value) { 
      this.exposureTarget = value;
      return this;
    }

    /**
     * @return {@link #exposureVariant} (Exposure or intervention or exposure state.)
     */
    public List<Reference> getExposureVariant() { 
      if (this.exposureVariant == null)
        this.exposureVariant = new ArrayList<Reference>();
      return this.exposureVariant;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setExposureVariant(List<Reference> theExposureVariant) { 
      this.exposureVariant = theExposureVariant;
      return this;
    }

    public boolean hasExposureVariant() { 
      if (this.exposureVariant == null)
        return false;
      for (Reference item : this.exposureVariant)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addExposureVariant() { //3
      Reference t = new Reference();
      if (this.exposureVariant == null)
        this.exposureVariant = new ArrayList<Reference>();
      this.exposureVariant.add(t);
      return t;
    }

    public Statistic addExposureVariant(Reference t) { //3
      if (t == null)
        return this;
      if (this.exposureVariant == null)
        this.exposureVariant = new ArrayList<Reference>();
      this.exposureVariant.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #exposureVariant}, creating it if it does not already exist
     */
    public Reference getExposureVariantFirstRep() { 
      if (getExposureVariant().isEmpty()) {
        addExposureVariant();
      }
      return getExposureVariant().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<Group> getExposureVariantTarget() { 
      if (this.exposureVariantTarget == null)
        this.exposureVariantTarget = new ArrayList<Group>();
      return this.exposureVariantTarget;
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public Group addExposureVariantTarget() { 
      Group r = new Group();
      if (this.exposureVariantTarget == null)
        this.exposureVariantTarget = new ArrayList<Group>();
      this.exposureVariantTarget.add(r);
      return r;
    }

    /**
     * @return {@link #measuredVariable} (Outcome or characteristic that is measured.)
     */
    public List<Reference> getMeasuredVariable() { 
      if (this.measuredVariable == null)
        this.measuredVariable = new ArrayList<Reference>();
      return this.measuredVariable;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setMeasuredVariable(List<Reference> theMeasuredVariable) { 
      this.measuredVariable = theMeasuredVariable;
      return this;
    }

    public boolean hasMeasuredVariable() { 
      if (this.measuredVariable == null)
        return false;
      for (Reference item : this.measuredVariable)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Reference addMeasuredVariable() { //3
      Reference t = new Reference();
      if (this.measuredVariable == null)
        this.measuredVariable = new ArrayList<Reference>();
      this.measuredVariable.add(t);
      return t;
    }

    public Statistic addMeasuredVariable(Reference t) { //3
      if (t == null)
        return this;
      if (this.measuredVariable == null)
        this.measuredVariable = new ArrayList<Reference>();
      this.measuredVariable.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #measuredVariable}, creating it if it does not already exist
     */
    public Reference getMeasuredVariableFirstRep() { 
      if (getMeasuredVariable().isEmpty()) {
        addMeasuredVariable();
      }
      return getMeasuredVariable().get(0);
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public List<EvidenceVariable> getMeasuredVariableTarget() { 
      if (this.measuredVariableTarget == null)
        this.measuredVariableTarget = new ArrayList<EvidenceVariable>();
      return this.measuredVariableTarget;
    }

    /**
     * @deprecated Use Reference#setResource(IBaseResource) instead
     */
    @Deprecated
    public EvidenceVariable addMeasuredVariableTarget() { 
      EvidenceVariable r = new EvidenceVariable();
      if (this.measuredVariableTarget == null)
        this.measuredVariableTarget = new ArrayList<EvidenceVariable>();
      this.measuredVariableTarget.add(r);
      return r;
    }

    /**
     * @return {@link #statisticType} (The effect or risk estimate type.)
     */
    public CodeableConcept getStatisticType() { 
      if (this.statisticType == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.statisticType");
        else if (Configuration.doAutoCreate())
          this.statisticType = new CodeableConcept(); // cc
      return this.statisticType;
    }

    public boolean hasStatisticType() { 
      return this.statisticType != null && !this.statisticType.isEmpty();
    }

    /**
     * @param value {@link #statisticType} (The effect or risk estimate type.)
     */
    public Statistic setStatisticType(CodeableConcept value) { 
      this.statisticType = value;
      return this;
    }

    /**
     * @return {@link #quantity} (The statistic value.)
     */
    public Quantity getQuantity() { 
      if (this.quantity == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.quantity");
        else if (Configuration.doAutoCreate())
          this.quantity = new Quantity(); // cc
      return this.quantity;
    }

    public boolean hasQuantity() { 
      return this.quantity != null && !this.quantity.isEmpty();
    }

    /**
     * @param value {@link #quantity} (The statistic value.)
     */
    public Statistic setQuantity(Quantity value) { 
      this.quantity = value;
      return this;
    }

    /**
     * @return {@link #sampleSize} (Population sample size.)
     */
    public StatisticSampleSizeComponent getSampleSize() { 
      if (this.sampleSize == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create Statistic.sampleSize");
        else if (Configuration.doAutoCreate())
          this.sampleSize = new StatisticSampleSizeComponent(); // cc
      return this.sampleSize;
    }

    public boolean hasSampleSize() { 
      return this.sampleSize != null && !this.sampleSize.isEmpty();
    }

    /**
     * @param value {@link #sampleSize} (Population sample size.)
     */
    public Statistic setSampleSize(StatisticSampleSizeComponent value) { 
      this.sampleSize = value;
      return this;
    }

    /**
     * @return {@link #precisionEstimate} (An estimate of the precision of the statistic.)
     */
    public List<StatisticPrecisionEstimateComponent> getPrecisionEstimate() { 
      if (this.precisionEstimate == null)
        this.precisionEstimate = new ArrayList<StatisticPrecisionEstimateComponent>();
      return this.precisionEstimate;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setPrecisionEstimate(List<StatisticPrecisionEstimateComponent> thePrecisionEstimate) { 
      this.precisionEstimate = thePrecisionEstimate;
      return this;
    }

    public boolean hasPrecisionEstimate() { 
      if (this.precisionEstimate == null)
        return false;
      for (StatisticPrecisionEstimateComponent item : this.precisionEstimate)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public StatisticPrecisionEstimateComponent addPrecisionEstimate() { //3
      StatisticPrecisionEstimateComponent t = new StatisticPrecisionEstimateComponent();
      if (this.precisionEstimate == null)
        this.precisionEstimate = new ArrayList<StatisticPrecisionEstimateComponent>();
      this.precisionEstimate.add(t);
      return t;
    }

    public Statistic addPrecisionEstimate(StatisticPrecisionEstimateComponent t) { //3
      if (t == null)
        return this;
      if (this.precisionEstimate == null)
        this.precisionEstimate = new ArrayList<StatisticPrecisionEstimateComponent>();
      this.precisionEstimate.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #precisionEstimate}, creating it if it does not already exist
     */
    public StatisticPrecisionEstimateComponent getPrecisionEstimateFirstRep() { 
      if (getPrecisionEstimate().isEmpty()) {
        addPrecisionEstimate();
      }
      return getPrecisionEstimate().get(0);
    }

    /**
     * @return {@link #pValue} (The probability that this statistic would be the same given the null hypothesis.)
     */
    public List<StatisticPValueComponent> getPValue() { 
      if (this.pValue == null)
        this.pValue = new ArrayList<StatisticPValueComponent>();
      return this.pValue;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setPValue(List<StatisticPValueComponent> thePValue) { 
      this.pValue = thePValue;
      return this;
    }

    public boolean hasPValue() { 
      if (this.pValue == null)
        return false;
      for (StatisticPValueComponent item : this.pValue)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public StatisticPValueComponent addPValue() { //3
      StatisticPValueComponent t = new StatisticPValueComponent();
      if (this.pValue == null)
        this.pValue = new ArrayList<StatisticPValueComponent>();
      this.pValue.add(t);
      return t;
    }

    public Statistic addPValue(StatisticPValueComponent t) { //3
      if (t == null)
        return this;
      if (this.pValue == null)
        this.pValue = new ArrayList<StatisticPValueComponent>();
      this.pValue.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #pValue}, creating it if it does not already exist
     */
    public StatisticPValueComponent getPValueFirstRep() { 
      if (getPValue().isEmpty()) {
        addPValue();
      }
      return getPValue().get(0);
    }

    /**
     * @return {@link #certainty} (A description of the certainty of the effect estimate.)
     */
    public List<StatisticCertaintyComponent> getCertainty() { 
      if (this.certainty == null)
        this.certainty = new ArrayList<StatisticCertaintyComponent>();
      return this.certainty;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public Statistic setCertainty(List<StatisticCertaintyComponent> theCertainty) { 
      this.certainty = theCertainty;
      return this;
    }

    public boolean hasCertainty() { 
      if (this.certainty == null)
        return false;
      for (StatisticCertaintyComponent item : this.certainty)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public StatisticCertaintyComponent addCertainty() { //3
      StatisticCertaintyComponent t = new StatisticCertaintyComponent();
      if (this.certainty == null)
        this.certainty = new ArrayList<StatisticCertaintyComponent>();
      this.certainty.add(t);
      return t;
    }

    public Statistic addCertainty(StatisticCertaintyComponent t) { //3
      if (t == null)
        return this;
      if (this.certainty == null)
        this.certainty = new ArrayList<StatisticCertaintyComponent>();
      this.certainty.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #certainty}, creating it if it does not already exist
     */
    public StatisticCertaintyComponent getCertaintyFirstRep() { 
      if (getCertainty().isEmpty()) {
        addCertainty();
      }
      return getCertainty().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("url", "uri", "An absolute URI that is used to identify this statistic when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this statistic is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the statistic is stored on different servers.", 0, 1, url));
        children.add(new Property("identifier", "Identifier", "A formal identifier that is used to identify this statistic when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("version", "string", "The identifier that is used to identify this version of the statistic when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the statistic author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version));
        children.add(new Property("title", "string", "A short, descriptive, user-friendly title for the statistic.", 0, 1, title));
        children.add(new Property("status", "code", "The status of this statistic. Enables tracking the life-cycle of the content.", 0, 1, status));
        children.add(new Property("date", "dateTime", "The date  (and optionally time) when the statistic was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the statistic changes.", 0, 1, date));
        children.add(new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.", 0, java.lang.Integer.MAX_VALUE, useContext));
        children.add(new Property("approvalDate", "date", "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.", 0, 1, approvalDate));
        children.add(new Property("lastReviewDate", "date", "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.", 0, 1, lastReviewDate));
        children.add(new Property("statisticPublisher", "", "The individual or organization that produced this statistic.", 0, java.lang.Integer.MAX_VALUE, statisticPublisher));
        children.add(new Property("contributor", "Contributor", "Contact detail and role for contributor to statistic.", 0, java.lang.Integer.MAX_VALUE, contributor));
        children.add(new Property("relatedArtifact", "RelatedArtifact", "Link to artifact associated with statistic.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact));
        children.add(new Property("description", "markdown", "A free text natural language description of the statistic from a consumer's perspective.", 0, 1, description));
        children.add(new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note));
        children.add(new Property("synthesisType", "CodeableConcept", "The particular type of synthesis if this is a synthesis statistic.", 0, 1, synthesisType));
        children.add(new Property("studyType", "CodeableConcept", "The type of study that produced this statistic.", 0, 1, studyType));
        children.add(new Property("exposureBackground", "Reference(Group)", "TBD.", 0, 1, exposureBackground));
        children.add(new Property("exposure", "Reference(Group)", "TBD.", 0, 1, exposure));
        children.add(new Property("exposureVariant", "Reference(Group)", "Exposure or intervention or exposure state.", 0, java.lang.Integer.MAX_VALUE, exposureVariant));
        children.add(new Property("measuredVariable", "Reference(EvidenceVariable)", "Outcome or characteristic that is measured.", 0, java.lang.Integer.MAX_VALUE, measuredVariable));
        children.add(new Property("statisticType", "CodeableConcept", "The effect or risk estimate type.", 0, 1, statisticType));
        children.add(new Property("quantity", "Quantity", "The statistic value.", 0, 1, quantity));
        children.add(new Property("sampleSize", "", "Population sample size.", 0, 1, sampleSize));
        children.add(new Property("precisionEstimate", "", "An estimate of the precision of the statistic.", 0, java.lang.Integer.MAX_VALUE, precisionEstimate));
        children.add(new Property("pValue", "", "The probability that this statistic would be the same given the null hypothesis.", 0, java.lang.Integer.MAX_VALUE, pValue));
        children.add(new Property("certainty", "", "A description of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, certainty));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case 116079: /*url*/  return new Property("url", "uri", "An absolute URI that is used to identify this statistic when it is referenced in a specification, model, design or an instance; also called its canonical identifier. This SHOULD be globally unique and SHOULD be a literal address at which at which an authoritative instance of this statistic is (or will be) published. This URL can be the target of a canonical reference. It SHALL remain the same when the statistic is stored on different servers.", 0, 1, url);
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A formal identifier that is used to identify this statistic when it is represented in other formats, or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case 351608024: /*version*/  return new Property("version", "string", "The identifier that is used to identify this version of the statistic when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the statistic author and is not expected to be globally unique. For example, it might be a timestamp (e.g. yyyymmdd) if a managed version is not available. There is also no expectation that versions can be placed in a lexicographical sequence.", 0, 1, version);
        case 110371416: /*title*/  return new Property("title", "string", "A short, descriptive, user-friendly title for the statistic.", 0, 1, title);
        case -892481550: /*status*/  return new Property("status", "code", "The status of this statistic. Enables tracking the life-cycle of the content.", 0, 1, status);
        case 3076014: /*date*/  return new Property("date", "dateTime", "The date  (and optionally time) when the statistic was published. The date must change when the business version changes and it must change if the status code changes. In addition, it should change when the substantive content of the statistic changes.", 0, 1, date);
        case -669707736: /*useContext*/  return new Property("useContext", "UsageContext", "The content was developed with a focus and intent of supporting the contexts that are listed. These contexts may be general categories (gender, age, ...) or may be references to specific programs (insurance plans, studies, ...) and may be used to assist with indexing and searching for appropriate evidence instances.", 0, java.lang.Integer.MAX_VALUE, useContext);
        case 223539345: /*approvalDate*/  return new Property("approvalDate", "date", "The date on which the resource content was approved by the publisher. Approval happens once when the content is officially approved for usage.", 0, 1, approvalDate);
        case -1687512484: /*lastReviewDate*/  return new Property("lastReviewDate", "date", "The date on which the resource content was last reviewed. Review happens periodically after approval but does not change the original approval date.", 0, 1, lastReviewDate);
        case -1485782388: /*statisticPublisher*/  return new Property("statisticPublisher", "", "The individual or organization that produced this statistic.", 0, java.lang.Integer.MAX_VALUE, statisticPublisher);
        case -1895276325: /*contributor*/  return new Property("contributor", "Contributor", "Contact detail and role for contributor to statistic.", 0, java.lang.Integer.MAX_VALUE, contributor);
        case 666807069: /*relatedArtifact*/  return new Property("relatedArtifact", "RelatedArtifact", "Link to artifact associated with statistic.", 0, java.lang.Integer.MAX_VALUE, relatedArtifact);
        case -1724546052: /*description*/  return new Property("description", "markdown", "A free text natural language description of the statistic from a consumer's perspective.", 0, 1, description);
        case 3387378: /*note*/  return new Property("note", "Annotation", "Footnotes and/or explanatory notes.", 0, java.lang.Integer.MAX_VALUE, note);
        case 672726254: /*synthesisType*/  return new Property("synthesisType", "CodeableConcept", "The particular type of synthesis if this is a synthesis statistic.", 0, 1, synthesisType);
        case -1955265373: /*studyType*/  return new Property("studyType", "CodeableConcept", "The type of study that produced this statistic.", 0, 1, studyType);
        case -832155243: /*exposureBackground*/  return new Property("exposureBackground", "Reference(Group)", "TBD.", 0, 1, exposureBackground);
        case -1926005497: /*exposure*/  return new Property("exposure", "Reference(Group)", "TBD.", 0, 1, exposure);
        case -19675778: /*exposureVariant*/  return new Property("exposureVariant", "Reference(Group)", "Exposure or intervention or exposure state.", 0, java.lang.Integer.MAX_VALUE, exposureVariant);
        case 263067490: /*measuredVariable*/  return new Property("measuredVariable", "Reference(EvidenceVariable)", "Outcome or characteristic that is measured.", 0, java.lang.Integer.MAX_VALUE, measuredVariable);
        case -392342358: /*statisticType*/  return new Property("statisticType", "CodeableConcept", "The effect or risk estimate type.", 0, 1, statisticType);
        case -1285004149: /*quantity*/  return new Property("quantity", "Quantity", "The statistic value.", 0, 1, quantity);
        case 143123659: /*sampleSize*/  return new Property("sampleSize", "", "Population sample size.", 0, 1, sampleSize);
        case 339632070: /*precisionEstimate*/  return new Property("precisionEstimate", "", "An estimate of the precision of the statistic.", 0, java.lang.Integer.MAX_VALUE, precisionEstimate);
        case -1006082335: /*pValue*/  return new Property("pValue", "", "The probability that this statistic would be the same given the null hypothesis.", 0, java.lang.Integer.MAX_VALUE, pValue);
        case -1404142937: /*certainty*/  return new Property("certainty", "", "A description of the certainty of the effect estimate.", 0, java.lang.Integer.MAX_VALUE, certainty);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return this.url == null ? new Base[0] : new Base[] {this.url}; // UriType
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case 351608024: /*version*/ return this.version == null ? new Base[0] : new Base[] {this.version}; // StringType
        case 110371416: /*title*/ return this.title == null ? new Base[0] : new Base[] {this.title}; // StringType
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<PublicationStatus>
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -669707736: /*useContext*/ return this.useContext == null ? new Base[0] : this.useContext.toArray(new Base[this.useContext.size()]); // UsageContext
        case 223539345: /*approvalDate*/ return this.approvalDate == null ? new Base[0] : new Base[] {this.approvalDate}; // DateType
        case -1687512484: /*lastReviewDate*/ return this.lastReviewDate == null ? new Base[0] : new Base[] {this.lastReviewDate}; // DateType
        case -1485782388: /*statisticPublisher*/ return this.statisticPublisher == null ? new Base[0] : this.statisticPublisher.toArray(new Base[this.statisticPublisher.size()]); // StatisticStatisticPublisherComponent
        case -1895276325: /*contributor*/ return this.contributor == null ? new Base[0] : this.contributor.toArray(new Base[this.contributor.size()]); // Contributor
        case 666807069: /*relatedArtifact*/ return this.relatedArtifact == null ? new Base[0] : this.relatedArtifact.toArray(new Base[this.relatedArtifact.size()]); // RelatedArtifact
        case -1724546052: /*description*/ return this.description == null ? new Base[0] : new Base[] {this.description}; // MarkdownType
        case 3387378: /*note*/ return this.note == null ? new Base[0] : this.note.toArray(new Base[this.note.size()]); // Annotation
        case 672726254: /*synthesisType*/ return this.synthesisType == null ? new Base[0] : new Base[] {this.synthesisType}; // CodeableConcept
        case -1955265373: /*studyType*/ return this.studyType == null ? new Base[0] : new Base[] {this.studyType}; // CodeableConcept
        case -832155243: /*exposureBackground*/ return this.exposureBackground == null ? new Base[0] : new Base[] {this.exposureBackground}; // Reference
        case -1926005497: /*exposure*/ return this.exposure == null ? new Base[0] : new Base[] {this.exposure}; // Reference
        case -19675778: /*exposureVariant*/ return this.exposureVariant == null ? new Base[0] : this.exposureVariant.toArray(new Base[this.exposureVariant.size()]); // Reference
        case 263067490: /*measuredVariable*/ return this.measuredVariable == null ? new Base[0] : this.measuredVariable.toArray(new Base[this.measuredVariable.size()]); // Reference
        case -392342358: /*statisticType*/ return this.statisticType == null ? new Base[0] : new Base[] {this.statisticType}; // CodeableConcept
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // Quantity
        case 143123659: /*sampleSize*/ return this.sampleSize == null ? new Base[0] : new Base[] {this.sampleSize}; // StatisticSampleSizeComponent
        case 339632070: /*precisionEstimate*/ return this.precisionEstimate == null ? new Base[0] : this.precisionEstimate.toArray(new Base[this.precisionEstimate.size()]); // StatisticPrecisionEstimateComponent
        case -1006082335: /*pValue*/ return this.pValue == null ? new Base[0] : this.pValue.toArray(new Base[this.pValue.size()]); // StatisticPValueComponent
        case -1404142937: /*certainty*/ return this.certainty == null ? new Base[0] : this.certainty.toArray(new Base[this.certainty.size()]); // StatisticCertaintyComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 116079: // url
          this.url = castToUri(value); // UriType
          return value;
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case 351608024: // version
          this.version = castToString(value); // StringType
          return value;
        case 110371416: // title
          this.title = castToString(value); // StringType
          return value;
        case -892481550: // status
          value = new PublicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
          return value;
        case 3076014: // date
          this.date = castToDateTime(value); // DateTimeType
          return value;
        case -669707736: // useContext
          this.getUseContext().add(castToUsageContext(value)); // UsageContext
          return value;
        case 223539345: // approvalDate
          this.approvalDate = castToDate(value); // DateType
          return value;
        case -1687512484: // lastReviewDate
          this.lastReviewDate = castToDate(value); // DateType
          return value;
        case -1485782388: // statisticPublisher
          this.getStatisticPublisher().add((StatisticStatisticPublisherComponent) value); // StatisticStatisticPublisherComponent
          return value;
        case -1895276325: // contributor
          this.getContributor().add(castToContributor(value)); // Contributor
          return value;
        case 666807069: // relatedArtifact
          this.getRelatedArtifact().add(castToRelatedArtifact(value)); // RelatedArtifact
          return value;
        case -1724546052: // description
          this.description = castToMarkdown(value); // MarkdownType
          return value;
        case 3387378: // note
          this.getNote().add(castToAnnotation(value)); // Annotation
          return value;
        case 672726254: // synthesisType
          this.synthesisType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1955265373: // studyType
          this.studyType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -832155243: // exposureBackground
          this.exposureBackground = castToReference(value); // Reference
          return value;
        case -1926005497: // exposure
          this.exposure = castToReference(value); // Reference
          return value;
        case -19675778: // exposureVariant
          this.getExposureVariant().add(castToReference(value)); // Reference
          return value;
        case 263067490: // measuredVariable
          this.getMeasuredVariable().add(castToReference(value)); // Reference
          return value;
        case -392342358: // statisticType
          this.statisticType = castToCodeableConcept(value); // CodeableConcept
          return value;
        case -1285004149: // quantity
          this.quantity = castToQuantity(value); // Quantity
          return value;
        case 143123659: // sampleSize
          this.sampleSize = (StatisticSampleSizeComponent) value; // StatisticSampleSizeComponent
          return value;
        case 339632070: // precisionEstimate
          this.getPrecisionEstimate().add((StatisticPrecisionEstimateComponent) value); // StatisticPrecisionEstimateComponent
          return value;
        case -1006082335: // pValue
          this.getPValue().add((StatisticPValueComponent) value); // StatisticPValueComponent
          return value;
        case -1404142937: // certainty
          this.getCertainty().add((StatisticCertaintyComponent) value); // StatisticCertaintyComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("url")) {
          this.url = castToUri(value); // UriType
        } else if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("version")) {
          this.version = castToString(value); // StringType
        } else if (name.equals("title")) {
          this.title = castToString(value); // StringType
        } else if (name.equals("status")) {
          value = new PublicationStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<PublicationStatus>
        } else if (name.equals("date")) {
          this.date = castToDateTime(value); // DateTimeType
        } else if (name.equals("useContext")) {
          this.getUseContext().add(castToUsageContext(value));
        } else if (name.equals("approvalDate")) {
          this.approvalDate = castToDate(value); // DateType
        } else if (name.equals("lastReviewDate")) {
          this.lastReviewDate = castToDate(value); // DateType
        } else if (name.equals("statisticPublisher")) {
          this.getStatisticPublisher().add((StatisticStatisticPublisherComponent) value);
        } else if (name.equals("contributor")) {
          this.getContributor().add(castToContributor(value));
        } else if (name.equals("relatedArtifact")) {
          this.getRelatedArtifact().add(castToRelatedArtifact(value));
        } else if (name.equals("description")) {
          this.description = castToMarkdown(value); // MarkdownType
        } else if (name.equals("note")) {
          this.getNote().add(castToAnnotation(value));
        } else if (name.equals("synthesisType")) {
          this.synthesisType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("studyType")) {
          this.studyType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("exposureBackground")) {
          this.exposureBackground = castToReference(value); // Reference
        } else if (name.equals("exposure")) {
          this.exposure = castToReference(value); // Reference
        } else if (name.equals("exposureVariant")) {
          this.getExposureVariant().add(castToReference(value));
        } else if (name.equals("measuredVariable")) {
          this.getMeasuredVariable().add(castToReference(value));
        } else if (name.equals("statisticType")) {
          this.statisticType = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("quantity")) {
          this.quantity = castToQuantity(value); // Quantity
        } else if (name.equals("sampleSize")) {
          this.sampleSize = (StatisticSampleSizeComponent) value; // StatisticSampleSizeComponent
        } else if (name.equals("precisionEstimate")) {
          this.getPrecisionEstimate().add((StatisticPrecisionEstimateComponent) value);
        } else if (name.equals("pValue")) {
          this.getPValue().add((StatisticPValueComponent) value);
        } else if (name.equals("certainty")) {
          this.getCertainty().add((StatisticCertaintyComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079:  return getUrlElement();
        case -1618432855:  return addIdentifier(); 
        case 351608024:  return getVersionElement();
        case 110371416:  return getTitleElement();
        case -892481550:  return getStatusElement();
        case 3076014:  return getDateElement();
        case -669707736:  return addUseContext(); 
        case 223539345:  return getApprovalDateElement();
        case -1687512484:  return getLastReviewDateElement();
        case -1485782388:  return addStatisticPublisher(); 
        case -1895276325:  return addContributor(); 
        case 666807069:  return addRelatedArtifact(); 
        case -1724546052:  return getDescriptionElement();
        case 3387378:  return addNote(); 
        case 672726254:  return getSynthesisType(); 
        case -1955265373:  return getStudyType(); 
        case -832155243:  return getExposureBackground(); 
        case -1926005497:  return getExposure(); 
        case -19675778:  return addExposureVariant(); 
        case 263067490:  return addMeasuredVariable(); 
        case -392342358:  return getStatisticType(); 
        case -1285004149:  return getQuantity(); 
        case 143123659:  return getSampleSize(); 
        case 339632070:  return addPrecisionEstimate(); 
        case -1006082335:  return addPValue(); 
        case -1404142937:  return addCertainty(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 116079: /*url*/ return new String[] {"uri"};
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case 351608024: /*version*/ return new String[] {"string"};
        case 110371416: /*title*/ return new String[] {"string"};
        case -892481550: /*status*/ return new String[] {"code"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -669707736: /*useContext*/ return new String[] {"UsageContext"};
        case 223539345: /*approvalDate*/ return new String[] {"date"};
        case -1687512484: /*lastReviewDate*/ return new String[] {"date"};
        case -1485782388: /*statisticPublisher*/ return new String[] {};
        case -1895276325: /*contributor*/ return new String[] {"Contributor"};
        case 666807069: /*relatedArtifact*/ return new String[] {"RelatedArtifact"};
        case -1724546052: /*description*/ return new String[] {"markdown"};
        case 3387378: /*note*/ return new String[] {"Annotation"};
        case 672726254: /*synthesisType*/ return new String[] {"CodeableConcept"};
        case -1955265373: /*studyType*/ return new String[] {"CodeableConcept"};
        case -832155243: /*exposureBackground*/ return new String[] {"Reference"};
        case -1926005497: /*exposure*/ return new String[] {"Reference"};
        case -19675778: /*exposureVariant*/ return new String[] {"Reference"};
        case 263067490: /*measuredVariable*/ return new String[] {"Reference"};
        case -392342358: /*statisticType*/ return new String[] {"CodeableConcept"};
        case -1285004149: /*quantity*/ return new String[] {"Quantity"};
        case 143123659: /*sampleSize*/ return new String[] {};
        case 339632070: /*precisionEstimate*/ return new String[] {};
        case -1006082335: /*pValue*/ return new String[] {};
        case -1404142937: /*certainty*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("url")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.url");
        }
        else if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("version")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.version");
        }
        else if (name.equals("title")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.title");
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.status");
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.date");
        }
        else if (name.equals("useContext")) {
          return addUseContext();
        }
        else if (name.equals("approvalDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.approvalDate");
        }
        else if (name.equals("lastReviewDate")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.lastReviewDate");
        }
        else if (name.equals("statisticPublisher")) {
          return addStatisticPublisher();
        }
        else if (name.equals("contributor")) {
          return addContributor();
        }
        else if (name.equals("relatedArtifact")) {
          return addRelatedArtifact();
        }
        else if (name.equals("description")) {
          throw new FHIRException("Cannot call addChild on a primitive type Statistic.description");
        }
        else if (name.equals("note")) {
          return addNote();
        }
        else if (name.equals("synthesisType")) {
          this.synthesisType = new CodeableConcept();
          return this.synthesisType;
        }
        else if (name.equals("studyType")) {
          this.studyType = new CodeableConcept();
          return this.studyType;
        }
        else if (name.equals("exposureBackground")) {
          this.exposureBackground = new Reference();
          return this.exposureBackground;
        }
        else if (name.equals("exposure")) {
          this.exposure = new Reference();
          return this.exposure;
        }
        else if (name.equals("exposureVariant")) {
          return addExposureVariant();
        }
        else if (name.equals("measuredVariable")) {
          return addMeasuredVariable();
        }
        else if (name.equals("statisticType")) {
          this.statisticType = new CodeableConcept();
          return this.statisticType;
        }
        else if (name.equals("quantity")) {
          this.quantity = new Quantity();
          return this.quantity;
        }
        else if (name.equals("sampleSize")) {
          this.sampleSize = new StatisticSampleSizeComponent();
          return this.sampleSize;
        }
        else if (name.equals("precisionEstimate")) {
          return addPrecisionEstimate();
        }
        else if (name.equals("pValue")) {
          return addPValue();
        }
        else if (name.equals("certainty")) {
          return addCertainty();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "Statistic";

  }

      public Statistic copy() {
        Statistic dst = new Statistic();
        copyValues(dst);
        return dst;
      }

      public void copyValues(Statistic dst) {
        super.copyValues(dst);
        dst.url = url == null ? null : url.copy();
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.version = version == null ? null : version.copy();
        dst.title = title == null ? null : title.copy();
        dst.status = status == null ? null : status.copy();
        dst.date = date == null ? null : date.copy();
        if (useContext != null) {
          dst.useContext = new ArrayList<UsageContext>();
          for (UsageContext i : useContext)
            dst.useContext.add(i.copy());
        };
        dst.approvalDate = approvalDate == null ? null : approvalDate.copy();
        dst.lastReviewDate = lastReviewDate == null ? null : lastReviewDate.copy();
        if (statisticPublisher != null) {
          dst.statisticPublisher = new ArrayList<StatisticStatisticPublisherComponent>();
          for (StatisticStatisticPublisherComponent i : statisticPublisher)
            dst.statisticPublisher.add(i.copy());
        };
        if (contributor != null) {
          dst.contributor = new ArrayList<Contributor>();
          for (Contributor i : contributor)
            dst.contributor.add(i.copy());
        };
        if (relatedArtifact != null) {
          dst.relatedArtifact = new ArrayList<RelatedArtifact>();
          for (RelatedArtifact i : relatedArtifact)
            dst.relatedArtifact.add(i.copy());
        };
        dst.description = description == null ? null : description.copy();
        if (note != null) {
          dst.note = new ArrayList<Annotation>();
          for (Annotation i : note)
            dst.note.add(i.copy());
        };
        dst.synthesisType = synthesisType == null ? null : synthesisType.copy();
        dst.studyType = studyType == null ? null : studyType.copy();
        dst.exposureBackground = exposureBackground == null ? null : exposureBackground.copy();
        dst.exposure = exposure == null ? null : exposure.copy();
        if (exposureVariant != null) {
          dst.exposureVariant = new ArrayList<Reference>();
          for (Reference i : exposureVariant)
            dst.exposureVariant.add(i.copy());
        };
        if (measuredVariable != null) {
          dst.measuredVariable = new ArrayList<Reference>();
          for (Reference i : measuredVariable)
            dst.measuredVariable.add(i.copy());
        };
        dst.statisticType = statisticType == null ? null : statisticType.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.sampleSize = sampleSize == null ? null : sampleSize.copy();
        if (precisionEstimate != null) {
          dst.precisionEstimate = new ArrayList<StatisticPrecisionEstimateComponent>();
          for (StatisticPrecisionEstimateComponent i : precisionEstimate)
            dst.precisionEstimate.add(i.copy());
        };
        if (pValue != null) {
          dst.pValue = new ArrayList<StatisticPValueComponent>();
          for (StatisticPValueComponent i : pValue)
            dst.pValue.add(i.copy());
        };
        if (certainty != null) {
          dst.certainty = new ArrayList<StatisticCertaintyComponent>();
          for (StatisticCertaintyComponent i : certainty)
            dst.certainty.add(i.copy());
        };
      }

      protected Statistic typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof Statistic))
          return false;
        Statistic o = (Statistic) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(approvalDate, o.approvalDate, true)
           && compareDeep(lastReviewDate, o.lastReviewDate, true) && compareDeep(statisticPublisher, o.statisticPublisher, true)
           && compareDeep(contributor, o.contributor, true) && compareDeep(relatedArtifact, o.relatedArtifact, true)
           && compareDeep(note, o.note, true) && compareDeep(synthesisType, o.synthesisType, true) && compareDeep(studyType, o.studyType, true)
           && compareDeep(exposureBackground, o.exposureBackground, true) && compareDeep(exposure, o.exposure, true)
           && compareDeep(exposureVariant, o.exposureVariant, true) && compareDeep(measuredVariable, o.measuredVariable, true)
           && compareDeep(statisticType, o.statisticType, true) && compareDeep(quantity, o.quantity, true)
           && compareDeep(sampleSize, o.sampleSize, true) && compareDeep(precisionEstimate, o.precisionEstimate, true)
           && compareDeep(pValue, o.pValue, true) && compareDeep(certainty, o.certainty, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof Statistic))
          return false;
        Statistic o = (Statistic) other_;
        return compareValues(approvalDate, o.approvalDate, true) && compareValues(lastReviewDate, o.lastReviewDate, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, approvalDate, lastReviewDate
          , statisticPublisher, contributor, relatedArtifact, note, synthesisType, studyType
          , exposureBackground, exposure, exposureVariant, measuredVariable, statisticType, quantity
          , sampleSize, precisionEstimate, pValue, certainty);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.Statistic;
   }

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The statistic publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Statistic.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="Statistic.date", description="The statistic publication date", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The statistic publication date</b><br>
   * Type: <b>date</b><br>
   * Path: <b>Statistic.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Statistic.identifier", description="External identifier for the statistic", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier for the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the statistic</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>Statistic.useContext.valueQuantity, Statistic.useContext.valueRange</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-quantity", path="(Statistic.useContext.value as Quantity) | (Statistic.useContext.value as Range)", description="A quantity- or range-valued use context assigned to the statistic", type="quantity" )
  public static final String SP_CONTEXT_QUANTITY = "context-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-quantity</b>
   * <p>
   * Description: <b>A quantity- or range-valued use context assigned to the statistic</b><br>
   * Type: <b>quantity</b><br>
   * Path: <b>Statistic.useContext.valueQuantity, Statistic.useContext.valueRange</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.QuantityClientParam CONTEXT_QUANTITY = new ca.uhn.fhir.rest.gclient.QuantityClientParam(SP_CONTEXT_QUANTITY);

 /**
   * Search parameter: <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the statistic</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-value", path="Statistic.useContext", description="A use context type and value assigned to the statistic", type="composite", compositeOf={"context-type", "context"} )
  public static final String SP_CONTEXT_TYPE_VALUE = "context-type-value";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-value</b>
   * <p>
   * Description: <b>A use context type and value assigned to the statistic</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam> CONTEXT_TYPE_VALUE = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.TokenClientParam>(SP_CONTEXT_TYPE_VALUE);

 /**
   * Search parameter: <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context", path="(Statistic.useContext.value as CodeableConcept)", description="A use context assigned to the statistic", type="token" )
  public static final String SP_CONTEXT = "context";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context</b>
   * <p>
   * Description: <b>A use context assigned to the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.useContext.valueCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT);

 /**
   * Search parameter: <b>description</b>
   * <p>
   * Description: <b>The description of the statistic</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Statistic.description</b><br>
   * </p>
   */
  @SearchParamDefinition(name="description", path="Statistic.description", description="The description of the statistic", type="string" )
  public static final String SP_DESCRIPTION = "description";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>description</b>
   * <p>
   * Description: <b>The description of the statistic</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Statistic.description</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam DESCRIPTION = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_DESCRIPTION);

 /**
   * Search parameter: <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.useContext.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type", path="Statistic.useContext.code", description="A type of use context assigned to the statistic", type="token" )
  public static final String SP_CONTEXT_TYPE = "context-type";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type</b>
   * <p>
   * Description: <b>A type of use context assigned to the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.useContext.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CONTEXT_TYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CONTEXT_TYPE);

 /**
   * Search parameter: <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the statistic</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Statistic.title</b><br>
   * </p>
   */
  @SearchParamDefinition(name="title", path="Statistic.title", description="The human-friendly name of the statistic", type="string" )
  public static final String SP_TITLE = "title";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>title</b>
   * <p>
   * Description: <b>The human-friendly name of the statistic</b><br>
   * Type: <b>string</b><br>
   * Path: <b>Statistic.title</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.StringClientParam TITLE = new ca.uhn.fhir.rest.gclient.StringClientParam(SP_TITLE);

 /**
   * Search parameter: <b>version</b>
   * <p>
   * Description: <b>The business version of the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.version</b><br>
   * </p>
   */
  @SearchParamDefinition(name="version", path="Statistic.version", description="The business version of the statistic", type="token" )
  public static final String SP_VERSION = "version";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>version</b>
   * <p>
   * Description: <b>The business version of the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.version</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam VERSION = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_VERSION);

 /**
   * Search parameter: <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the statistic</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Statistic.url</b><br>
   * </p>
   */
  @SearchParamDefinition(name="url", path="Statistic.url", description="The uri that identifies the statistic", type="uri" )
  public static final String SP_URL = "url";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>url</b>
   * <p>
   * Description: <b>The uri that identifies the statistic</b><br>
   * Type: <b>uri</b><br>
   * Path: <b>Statistic.url</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.UriClientParam URL = new ca.uhn.fhir.rest.gclient.UriClientParam(SP_URL);

 /**
   * Search parameter: <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the statistic</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="context-type-quantity", path="Statistic.useContext", description="A use context type and quantity- or range-based value assigned to the statistic", type="composite", compositeOf={"context-type", "context-quantity"} )
  public static final String SP_CONTEXT_TYPE_QUANTITY = "context-type-quantity";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>context-type-quantity</b>
   * <p>
   * Description: <b>A use context type and quantity- or range-based value assigned to the statistic</b><br>
   * Type: <b>composite</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam> CONTEXT_TYPE_QUANTITY = new ca.uhn.fhir.rest.gclient.CompositeClientParam<ca.uhn.fhir.rest.gclient.TokenClientParam, ca.uhn.fhir.rest.gclient.QuantityClientParam>(SP_CONTEXT_TYPE_QUANTITY);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The current status of the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="Statistic.status", description="The current status of the statistic", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The current status of the statistic</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Statistic.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);


}

