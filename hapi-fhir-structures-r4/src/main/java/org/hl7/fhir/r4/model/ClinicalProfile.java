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

// Generated on Tue, Apr 16, 2019 08:42-0500 for FHIR v4.1.0

import java.util.*;

import java.math.*;
import org.hl7.fhir.utilities.Utilities;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;
import org.hl7.fhir.instance.model.api.*;
import org.hl7.fhir.exceptions.FHIRException;
/**
 * Clinical Profiles summarize and demonstrate the features of a population.
 */
@ResourceDef(name="ClinicalProfile", profile="http://hl7.org/fhir/StructureDefinition/ClinicalProfile")
public class ClinicalProfile extends DomainResource {

    public enum ClinicalProfileStatus {
        /**
         * The report is complete and ready for use.
         */
        COMPLETE, 
        /**
         * A report is available but it hasn't vbeen verified.
         */
        DRAFT, 
        /**
         * The report is not to be used because some sort of error has occurred.
         */
        ERROR, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static ClinicalProfileStatus fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return COMPLETE;
        if ("draft".equals(codeString))
          return DRAFT;
        if ("error".equals(codeString))
          return ERROR;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown ClinicalProfileStatus code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case COMPLETE: return "complete";
            case DRAFT: return "draft";
            case ERROR: return "error";
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case COMPLETE: return "http://hl7.org/fhir/clinical-profile-status";
            case DRAFT: return "http://hl7.org/fhir/clinical-profile-status";
            case ERROR: return "http://hl7.org/fhir/clinical-profile-status";
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case COMPLETE: return "The report is complete and ready for use.";
            case DRAFT: return "A report is available but it hasn't vbeen verified.";
            case ERROR: return "The report is not to be used because some sort of error has occurred.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case COMPLETE: return "Complete";
            case DRAFT: return "Draft";
            case ERROR: return "Error";
            default: return "?";
          }
        }
    }

  public static class ClinicalProfileStatusEnumFactory implements EnumFactory<ClinicalProfileStatus> {
    public ClinicalProfileStatus fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("complete".equals(codeString))
          return ClinicalProfileStatus.COMPLETE;
        if ("draft".equals(codeString))
          return ClinicalProfileStatus.DRAFT;
        if ("error".equals(codeString))
          return ClinicalProfileStatus.ERROR;
        throw new IllegalArgumentException("Unknown ClinicalProfileStatus code '"+codeString+"'");
        }
        public Enumeration<ClinicalProfileStatus> fromType(Base code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<ClinicalProfileStatus>(this);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return null;
        if ("complete".equals(codeString))
          return new Enumeration<ClinicalProfileStatus>(this, ClinicalProfileStatus.COMPLETE);
        if ("draft".equals(codeString))
          return new Enumeration<ClinicalProfileStatus>(this, ClinicalProfileStatus.DRAFT);
        if ("error".equals(codeString))
          return new Enumeration<ClinicalProfileStatus>(this, ClinicalProfileStatus.ERROR);
        throw new FHIRException("Unknown ClinicalProfileStatus code '"+codeString+"'");
        }
    public String toCode(ClinicalProfileStatus code) {
      if (code == ClinicalProfileStatus.COMPLETE)
        return "complete";
      if (code == ClinicalProfileStatus.DRAFT)
        return "draft";
      if (code == ClinicalProfileStatus.ERROR)
        return "error";
      return "?";
      }
    public String toSystem(ClinicalProfileStatus code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class ClinicalProfileLabComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Code(s) for the tests that compose this specific sample.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Lab code (LOINC)", formalDefinition="Code(s) for the tests that compose this specific sample." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/observation-codes")
        protected List<CodeableConcept> code;

        /**
         * Total number of lab tests.
         */
        @Child(name = "count", type = {IntegerType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Total number of lab tests", formalDefinition="Total number of lab tests." )
        protected IntegerType count;

        /**
         * The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        @Child(name = "frequencyPerYear", type = {DecimalType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Frequency of this lab ordered/reported per patient per year", formalDefinition="The average number of times this test was ordered and reported per patient in the particular cohort per year." )
        protected DecimalType frequencyPerYear;

        /**
         * The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fraction of subjects with this lab", formalDefinition="The fraction of the patients in this cohort that have one or more orders for this lab." )
        protected DecimalType fractionOfSubjects;

        /**
         * Scalar sample summary.
         */
        @Child(name = "scalarDistribution", type = {}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Scalar sample summary", formalDefinition="Scalar sample summary." )
        protected ClinicalProfileLabScalarDistributionComponent scalarDistribution;

        private static final long serialVersionUID = -1145613225L;

    /**
     * Constructor
     */
      public ClinicalProfileLabComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabComponent(IntegerType count) {
        super();
        this.count = count;
      }

        /**
         * @return {@link #code} (Code(s) for the tests that compose this specific sample.)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileLabComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #count} (Total number of lab tests.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public IntegerType getCountElement() { 
          if (this.count == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.count");
            else if (Configuration.doAutoCreate())
              this.count = new IntegerType(); // bb
          return this.count;
        }

        public boolean hasCountElement() { 
          return this.count != null && !this.count.isEmpty();
        }

        public boolean hasCount() { 
          return this.count != null && !this.count.isEmpty();
        }

        /**
         * @param value {@link #count} (Total number of lab tests.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public ClinicalProfileLabComponent setCountElement(IntegerType value) { 
          this.count = value;
          return this;
        }

        /**
         * @return Total number of lab tests.
         */
        public int getCount() { 
          return this.count == null || this.count.isEmpty() ? 0 : this.count.getValue();
        }

        /**
         * @param value Total number of lab tests.
         */
        public ClinicalProfileLabComponent setCount(int value) { 
            if (this.count == null)
              this.count = new IntegerType();
            this.count.setValue(value);
          return this;
        }

        /**
         * @return {@link #frequencyPerYear} (The average number of times this test was ordered and reported per patient in the particular cohort per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public DecimalType getFrequencyPerYearElement() { 
          if (this.frequencyPerYear == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.frequencyPerYear");
            else if (Configuration.doAutoCreate())
              this.frequencyPerYear = new DecimalType(); // bb
          return this.frequencyPerYear;
        }

        public boolean hasFrequencyPerYearElement() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        public boolean hasFrequencyPerYear() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        /**
         * @param value {@link #frequencyPerYear} (The average number of times this test was ordered and reported per patient in the particular cohort per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public ClinicalProfileLabComponent setFrequencyPerYearElement(DecimalType value) { 
          this.frequencyPerYear = value;
          return this;
        }

        /**
         * @return The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public BigDecimal getFrequencyPerYear() { 
          return this.frequencyPerYear == null ? null : this.frequencyPerYear.getValue();
        }

        /**
         * @param value The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public ClinicalProfileLabComponent setFrequencyPerYear(BigDecimal value) { 
          if (value == null)
            this.frequencyPerYear = null;
          else {
            if (this.frequencyPerYear == null)
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          }
          return this;
        }

        /**
         * @param value The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public ClinicalProfileLabComponent setFrequencyPerYear(long value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @param value The average number of times this test was ordered and reported per patient in the particular cohort per year.
         */
        public ClinicalProfileLabComponent setFrequencyPerYear(double value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionOfSubjects} (The fraction of the patients in this cohort that have one or more orders for this lab.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (The fraction of the patients in this cohort that have one or more orders for this lab.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileLabComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public ClinicalProfileLabComponent setFractionOfSubjects(BigDecimal value) { 
          if (value == null)
            this.fractionOfSubjects = null;
          else {
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          }
          return this;
        }

        /**
         * @param value The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public ClinicalProfileLabComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value The fraction of the patients in this cohort that have one or more orders for this lab.
         */
        public ClinicalProfileLabComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #scalarDistribution} (Scalar sample summary.)
         */
        public ClinicalProfileLabScalarDistributionComponent getScalarDistribution() { 
          if (this.scalarDistribution == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabComponent.scalarDistribution");
            else if (Configuration.doAutoCreate())
              this.scalarDistribution = new ClinicalProfileLabScalarDistributionComponent(); // cc
          return this.scalarDistribution;
        }

        public boolean hasScalarDistribution() { 
          return this.scalarDistribution != null && !this.scalarDistribution.isEmpty();
        }

        /**
         * @param value {@link #scalarDistribution} (Scalar sample summary.)
         */
        public ClinicalProfileLabComponent setScalarDistribution(ClinicalProfileLabScalarDistributionComponent value) { 
          this.scalarDistribution = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Code(s) for the tests that compose this specific sample.", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("count", "integer", "Total number of lab tests.", 0, 1, count));
          children.add(new Property("frequencyPerYear", "decimal", "The average number of times this test was ordered and reported per patient in the particular cohort per year.", 0, 1, frequencyPerYear));
          children.add(new Property("fractionOfSubjects", "decimal", "The fraction of the patients in this cohort that have one or more orders for this lab.", 0, 1, fractionOfSubjects));
          children.add(new Property("scalarDistribution", "", "Scalar sample summary.", 0, 1, scalarDistribution));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Code(s) for the tests that compose this specific sample.", 0, java.lang.Integer.MAX_VALUE, code);
          case 94851343: /*count*/  return new Property("count", "integer", "Total number of lab tests.", 0, 1, count);
          case 751135230: /*frequencyPerYear*/  return new Property("frequencyPerYear", "decimal", "The average number of times this test was ordered and reported per patient in the particular cohort per year.", 0, 1, frequencyPerYear);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "The fraction of the patients in this cohort that have one or more orders for this lab.", 0, 1, fractionOfSubjects);
          case 1459962000: /*scalarDistribution*/  return new Property("scalarDistribution", "", "Scalar sample summary.", 0, 1, scalarDistribution);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case 94851343: /*count*/ return this.count == null ? new Base[0] : new Base[] {this.count}; // IntegerType
        case 751135230: /*frequencyPerYear*/ return this.frequencyPerYear == null ? new Base[0] : new Base[] {this.frequencyPerYear}; // DecimalType
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case 1459962000: /*scalarDistribution*/ return this.scalarDistribution == null ? new Base[0] : new Base[] {this.scalarDistribution}; // ClinicalProfileLabScalarDistributionComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 94851343: // count
          this.count = castToInteger(value); // IntegerType
          return value;
        case 751135230: // frequencyPerYear
          this.frequencyPerYear = castToDecimal(value); // DecimalType
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case 1459962000: // scalarDistribution
          this.scalarDistribution = (ClinicalProfileLabScalarDistributionComponent) value; // ClinicalProfileLabScalarDistributionComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("count")) {
          this.count = castToInteger(value); // IntegerType
        } else if (name.equals("frequencyPerYear")) {
          this.frequencyPerYear = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("scalarDistribution")) {
          this.scalarDistribution = (ClinicalProfileLabScalarDistributionComponent) value; // ClinicalProfileLabScalarDistributionComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case 94851343:  return getCountElement();
        case 751135230:  return getFrequencyPerYearElement();
        case -254443680:  return getFractionOfSubjectsElement();
        case 1459962000:  return getScalarDistribution(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 94851343: /*count*/ return new String[] {"integer"};
        case 751135230: /*frequencyPerYear*/ return new String[] {"decimal"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case 1459962000: /*scalarDistribution*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("count")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.count");
        }
        else if (name.equals("frequencyPerYear")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.frequencyPerYear");
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("scalarDistribution")) {
          this.scalarDistribution = new ClinicalProfileLabScalarDistributionComponent();
          return this.scalarDistribution;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabComponent copy() {
        ClinicalProfileLabComponent dst = new ClinicalProfileLabComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabComponent dst) {
        super.copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.count = count == null ? null : count.copy();
        dst.frequencyPerYear = frequencyPerYear == null ? null : frequencyPerYear.copy();
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.scalarDistribution = scalarDistribution == null ? null : scalarDistribution.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabComponent))
          return false;
        ClinicalProfileLabComponent o = (ClinicalProfileLabComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(count, o.count, true) && compareDeep(frequencyPerYear, o.frequencyPerYear, true)
           && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true) && compareDeep(scalarDistribution, o.scalarDistribution, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabComponent))
          return false;
        ClinicalProfileLabComponent o = (ClinicalProfileLabComponent) other_;
        return compareValues(count, o.count, true) && compareValues(frequencyPerYear, o.frequencyPerYear, true)
           && compareValues(fractionOfSubjects, o.fractionOfSubjects, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, count, frequencyPerYear
          , fractionOfSubjects, scalarDistribution);
      }

  public String fhirType() {
    return "ClinicalProfile.lab";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Units of numeric result -- this is not actually a quantity… value is not allowed.
         */
        @Child(name = "units", type = {Quantity.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Units of scalar result", formalDefinition="Units of numeric result -- this is not actually a quantity… value is not allowed." )
        protected Quantity units;

        /**
         * The minimum value of this lab for all of the patients in this cohort.
         */
        @Child(name = "min", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Minimum value", formalDefinition="The minimum value of this lab for all of the patients in this cohort." )
        protected DecimalType min;

        /**
         * The maximum value of this lab for all of the patients in this cohort.
         */
        @Child(name = "max", type = {DecimalType.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Maximum value", formalDefinition="The maximum value of this lab for all of the patients in this cohort." )
        protected DecimalType max;

        /**
         * The mean or average value for all of the patients in this cohort.
         */
        @Child(name = "mean", type = {DecimalType.class}, order=4, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Mean", formalDefinition="The mean or average value for all of the patients in this cohort." )
        protected DecimalType mean;

        /**
         * The median value for all of the patients in this cohort.
         */
        @Child(name = "median", type = {DecimalType.class}, order=5, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Median", formalDefinition="The median value for all of the patients in this cohort." )
        protected DecimalType median;

        /**
         * The standard deviation for all of the patients in this cohort.
         */
        @Child(name = "stdDev", type = {DecimalType.class}, order=6, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Standard deviation", formalDefinition="The standard deviation for all of the patients in this cohort." )
        protected DecimalType stdDev;

        /**
         * Decile partitions.
         */
        @Child(name = "decile", type = {}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Decile partitions", formalDefinition="Decile partitions." )
        protected List<ClinicalProfileLabScalarDistributionDecileComponent> decile;

        /**
         * The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        @Child(name = "normalizedHigh", type = {DecimalType.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Normalize high normal range", formalDefinition="The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range." )
        protected DecimalType normalizedHigh;

        /**
         * The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        @Child(name = "normalizedLow", type = {DecimalType.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Normalize low normal range", formalDefinition="The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range." )
        protected DecimalType normalizedLow;

        /**
         * Fraction of samples above normalized normal range.
         */
        @Child(name = "fractionAboveNormal", type = {DecimalType.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fraction of samples above normalized normal range", formalDefinition="Fraction of samples above normalized normal range." )
        protected DecimalType fractionAboveNormal;

        /**
         * Fraction of samples below normalized normal range.
         */
        @Child(name = "fractionBelowNormal", type = {DecimalType.class}, order=11, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fraction of samples below normalized normal range", formalDefinition="Fraction of samples below normalized normal range." )
        protected DecimalType fractionBelowNormal;

        /**
         * An ordered list of the laboratory tests  that are most closely correlated.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedLabs", type = {}, order=12, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated laboratory tests", formalDefinition="An ordered list of the laboratory tests  that are most closely correlated.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedLabsComponent correlatedLabs;

        /**
         * An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedDiagnoses", type = {}, order=13, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated diagnosies", formalDefinition="An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent correlatedDiagnoses;

        /**
         * An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedMedications", type = {}, order=14, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated medications", formalDefinition="An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent correlatedMedications;

        /**
         * An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedProcedures", type = {}, order=15, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated procedures", formalDefinition="An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent correlatedProcedures;

        /**
         * An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedPhenotypes", type = {}, order=16, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated phenotypes", formalDefinition="An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent correlatedPhenotypes;

        private static final long serialVersionUID = -43642580L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionComponent(Quantity units, DecimalType min, DecimalType max, DecimalType mean, DecimalType median, DecimalType stdDev) {
        super();
        this.units = units;
        this.min = min;
        this.max = max;
        this.mean = mean;
        this.median = median;
        this.stdDev = stdDev;
      }

        /**
         * @return {@link #units} (Units of numeric result -- this is not actually a quantity… value is not allowed.)
         */
        public Quantity getUnits() { 
          if (this.units == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.units");
            else if (Configuration.doAutoCreate())
              this.units = new Quantity(); // cc
          return this.units;
        }

        public boolean hasUnits() { 
          return this.units != null && !this.units.isEmpty();
        }

        /**
         * @param value {@link #units} (Units of numeric result -- this is not actually a quantity… value is not allowed.)
         */
        public ClinicalProfileLabScalarDistributionComponent setUnits(Quantity value) { 
          this.units = value;
          return this;
        }

        /**
         * @return {@link #min} (The minimum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
         */
        public DecimalType getMinElement() { 
          if (this.min == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.min");
            else if (Configuration.doAutoCreate())
              this.min = new DecimalType(); // bb
          return this.min;
        }

        public boolean hasMinElement() { 
          return this.min != null && !this.min.isEmpty();
        }

        public boolean hasMin() { 
          return this.min != null && !this.min.isEmpty();
        }

        /**
         * @param value {@link #min} (The minimum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMin" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMinElement(DecimalType value) { 
          this.min = value;
          return this;
        }

        /**
         * @return The minimum value of this lab for all of the patients in this cohort.
         */
        public BigDecimal getMin() { 
          return this.min == null ? null : this.min.getValue();
        }

        /**
         * @param value The minimum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMin(BigDecimal value) { 
            if (this.min == null)
              this.min = new DecimalType();
            this.min.setValue(value);
          return this;
        }

        /**
         * @param value The minimum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMin(long value) { 
              this.min = new DecimalType();
            this.min.setValue(value);
          return this;
        }

        /**
         * @param value The minimum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMin(double value) { 
              this.min = new DecimalType();
            this.min.setValue(value);
          return this;
        }

        /**
         * @return {@link #max} (The maximum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
         */
        public DecimalType getMaxElement() { 
          if (this.max == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.max");
            else if (Configuration.doAutoCreate())
              this.max = new DecimalType(); // bb
          return this.max;
        }

        public boolean hasMaxElement() { 
          return this.max != null && !this.max.isEmpty();
        }

        public boolean hasMax() { 
          return this.max != null && !this.max.isEmpty();
        }

        /**
         * @param value {@link #max} (The maximum value of this lab for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMax" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMaxElement(DecimalType value) { 
          this.max = value;
          return this;
        }

        /**
         * @return The maximum value of this lab for all of the patients in this cohort.
         */
        public BigDecimal getMax() { 
          return this.max == null ? null : this.max.getValue();
        }

        /**
         * @param value The maximum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMax(BigDecimal value) { 
            if (this.max == null)
              this.max = new DecimalType();
            this.max.setValue(value);
          return this;
        }

        /**
         * @param value The maximum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMax(long value) { 
              this.max = new DecimalType();
            this.max.setValue(value);
          return this;
        }

        /**
         * @param value The maximum value of this lab for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMax(double value) { 
              this.max = new DecimalType();
            this.max.setValue(value);
          return this;
        }

        /**
         * @return {@link #mean} (The mean or average value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMean" gives direct access to the value
         */
        public DecimalType getMeanElement() { 
          if (this.mean == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.mean");
            else if (Configuration.doAutoCreate())
              this.mean = new DecimalType(); // bb
          return this.mean;
        }

        public boolean hasMeanElement() { 
          return this.mean != null && !this.mean.isEmpty();
        }

        public boolean hasMean() { 
          return this.mean != null && !this.mean.isEmpty();
        }

        /**
         * @param value {@link #mean} (The mean or average value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMean" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMeanElement(DecimalType value) { 
          this.mean = value;
          return this;
        }

        /**
         * @return The mean or average value for all of the patients in this cohort.
         */
        public BigDecimal getMean() { 
          return this.mean == null ? null : this.mean.getValue();
        }

        /**
         * @param value The mean or average value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMean(BigDecimal value) { 
            if (this.mean == null)
              this.mean = new DecimalType();
            this.mean.setValue(value);
          return this;
        }

        /**
         * @param value The mean or average value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMean(long value) { 
              this.mean = new DecimalType();
            this.mean.setValue(value);
          return this;
        }

        /**
         * @param value The mean or average value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMean(double value) { 
              this.mean = new DecimalType();
            this.mean.setValue(value);
          return this;
        }

        /**
         * @return {@link #median} (The median value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMedian" gives direct access to the value
         */
        public DecimalType getMedianElement() { 
          if (this.median == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.median");
            else if (Configuration.doAutoCreate())
              this.median = new DecimalType(); // bb
          return this.median;
        }

        public boolean hasMedianElement() { 
          return this.median != null && !this.median.isEmpty();
        }

        public boolean hasMedian() { 
          return this.median != null && !this.median.isEmpty();
        }

        /**
         * @param value {@link #median} (The median value for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getMedian" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setMedianElement(DecimalType value) { 
          this.median = value;
          return this;
        }

        /**
         * @return The median value for all of the patients in this cohort.
         */
        public BigDecimal getMedian() { 
          return this.median == null ? null : this.median.getValue();
        }

        /**
         * @param value The median value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMedian(BigDecimal value) { 
            if (this.median == null)
              this.median = new DecimalType();
            this.median.setValue(value);
          return this;
        }

        /**
         * @param value The median value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMedian(long value) { 
              this.median = new DecimalType();
            this.median.setValue(value);
          return this;
        }

        /**
         * @param value The median value for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setMedian(double value) { 
              this.median = new DecimalType();
            this.median.setValue(value);
          return this;
        }

        /**
         * @return {@link #stdDev} (The standard deviation for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getStdDev" gives direct access to the value
         */
        public DecimalType getStdDevElement() { 
          if (this.stdDev == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.stdDev");
            else if (Configuration.doAutoCreate())
              this.stdDev = new DecimalType(); // bb
          return this.stdDev;
        }

        public boolean hasStdDevElement() { 
          return this.stdDev != null && !this.stdDev.isEmpty();
        }

        public boolean hasStdDev() { 
          return this.stdDev != null && !this.stdDev.isEmpty();
        }

        /**
         * @param value {@link #stdDev} (The standard deviation for all of the patients in this cohort.). This is the underlying object with id, value and extensions. The accessor "getStdDev" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDevElement(DecimalType value) { 
          this.stdDev = value;
          return this;
        }

        /**
         * @return The standard deviation for all of the patients in this cohort.
         */
        public BigDecimal getStdDev() { 
          return this.stdDev == null ? null : this.stdDev.getValue();
        }

        /**
         * @param value The standard deviation for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDev(BigDecimal value) { 
            if (this.stdDev == null)
              this.stdDev = new DecimalType();
            this.stdDev.setValue(value);
          return this;
        }

        /**
         * @param value The standard deviation for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDev(long value) { 
              this.stdDev = new DecimalType();
            this.stdDev.setValue(value);
          return this;
        }

        /**
         * @param value The standard deviation for all of the patients in this cohort.
         */
        public ClinicalProfileLabScalarDistributionComponent setStdDev(double value) { 
              this.stdDev = new DecimalType();
            this.stdDev.setValue(value);
          return this;
        }

        /**
         * @return {@link #decile} (Decile partitions.)
         */
        public List<ClinicalProfileLabScalarDistributionDecileComponent> getDecile() { 
          if (this.decile == null)
            this.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          return this.decile;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionComponent setDecile(List<ClinicalProfileLabScalarDistributionDecileComponent> theDecile) { 
          this.decile = theDecile;
          return this;
        }

        public boolean hasDecile() { 
          if (this.decile == null)
            return false;
          for (ClinicalProfileLabScalarDistributionDecileComponent item : this.decile)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileLabScalarDistributionDecileComponent addDecile() { //3
          ClinicalProfileLabScalarDistributionDecileComponent t = new ClinicalProfileLabScalarDistributionDecileComponent();
          if (this.decile == null)
            this.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          this.decile.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionComponent addDecile(ClinicalProfileLabScalarDistributionDecileComponent t) { //3
          if (t == null)
            return this;
          if (this.decile == null)
            this.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          this.decile.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #decile}, creating it if it does not already exist
         */
        public ClinicalProfileLabScalarDistributionDecileComponent getDecileFirstRep() { 
          if (getDecile().isEmpty()) {
            addDecile();
          }
          return getDecile().get(0);
        }

        /**
         * @return {@link #normalizedHigh} (The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedHigh" gives direct access to the value
         */
        public DecimalType getNormalizedHighElement() { 
          if (this.normalizedHigh == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.normalizedHigh");
            else if (Configuration.doAutoCreate())
              this.normalizedHigh = new DecimalType(); // bb
          return this.normalizedHigh;
        }

        public boolean hasNormalizedHighElement() { 
          return this.normalizedHigh != null && !this.normalizedHigh.isEmpty();
        }

        public boolean hasNormalizedHigh() { 
          return this.normalizedHigh != null && !this.normalizedHigh.isEmpty();
        }

        /**
         * @param value {@link #normalizedHigh} (The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedHigh" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHighElement(DecimalType value) { 
          this.normalizedHigh = value;
          return this;
        }

        /**
         * @return The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public BigDecimal getNormalizedHigh() { 
          return this.normalizedHigh == null ? null : this.normalizedHigh.getValue();
        }

        /**
         * @param value The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHigh(BigDecimal value) { 
          if (value == null)
            this.normalizedHigh = null;
          else {
            if (this.normalizedHigh == null)
              this.normalizedHigh = new DecimalType();
            this.normalizedHigh.setValue(value);
          }
          return this;
        }

        /**
         * @param value The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHigh(long value) { 
              this.normalizedHigh = new DecimalType();
            this.normalizedHigh.setValue(value);
          return this;
        }

        /**
         * @param value The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedHigh(double value) { 
              this.normalizedHigh = new DecimalType();
            this.normalizedHigh.setValue(value);
          return this;
        }

        /**
         * @return {@link #normalizedLow} (The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedLow" gives direct access to the value
         */
        public DecimalType getNormalizedLowElement() { 
          if (this.normalizedLow == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.normalizedLow");
            else if (Configuration.doAutoCreate())
              this.normalizedLow = new DecimalType(); // bb
          return this.normalizedLow;
        }

        public boolean hasNormalizedLowElement() { 
          return this.normalizedLow != null && !this.normalizedLow.isEmpty();
        }

        public boolean hasNormalizedLow() { 
          return this.normalizedLow != null && !this.normalizedLow.isEmpty();
        }

        /**
         * @param value {@link #normalizedLow} (The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.). This is the underlying object with id, value and extensions. The accessor "getNormalizedLow" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLowElement(DecimalType value) { 
          this.normalizedLow = value;
          return this;
        }

        /**
         * @return The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public BigDecimal getNormalizedLow() { 
          return this.normalizedLow == null ? null : this.normalizedLow.getValue();
        }

        /**
         * @param value The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLow(BigDecimal value) { 
          if (value == null)
            this.normalizedLow = null;
          else {
            if (this.normalizedLow == null)
              this.normalizedLow = new DecimalType();
            this.normalizedLow.setValue(value);
          }
          return this;
        }

        /**
         * @param value The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLow(long value) { 
              this.normalizedLow = new DecimalType();
            this.normalizedLow.setValue(value);
          return this;
        }

        /**
         * @param value The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.
         */
        public ClinicalProfileLabScalarDistributionComponent setNormalizedLow(double value) { 
              this.normalizedLow = new DecimalType();
            this.normalizedLow.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionAboveNormal} (Fraction of samples above normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionAboveNormal" gives direct access to the value
         */
        public DecimalType getFractionAboveNormalElement() { 
          if (this.fractionAboveNormal == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.fractionAboveNormal");
            else if (Configuration.doAutoCreate())
              this.fractionAboveNormal = new DecimalType(); // bb
          return this.fractionAboveNormal;
        }

        public boolean hasFractionAboveNormalElement() { 
          return this.fractionAboveNormal != null && !this.fractionAboveNormal.isEmpty();
        }

        public boolean hasFractionAboveNormal() { 
          return this.fractionAboveNormal != null && !this.fractionAboveNormal.isEmpty();
        }

        /**
         * @param value {@link #fractionAboveNormal} (Fraction of samples above normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionAboveNormal" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormalElement(DecimalType value) { 
          this.fractionAboveNormal = value;
          return this;
        }

        /**
         * @return Fraction of samples above normalized normal range.
         */
        public BigDecimal getFractionAboveNormal() { 
          return this.fractionAboveNormal == null ? null : this.fractionAboveNormal.getValue();
        }

        /**
         * @param value Fraction of samples above normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormal(BigDecimal value) { 
          if (value == null)
            this.fractionAboveNormal = null;
          else {
            if (this.fractionAboveNormal == null)
              this.fractionAboveNormal = new DecimalType();
            this.fractionAboveNormal.setValue(value);
          }
          return this;
        }

        /**
         * @param value Fraction of samples above normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormal(long value) { 
              this.fractionAboveNormal = new DecimalType();
            this.fractionAboveNormal.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of samples above normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionAboveNormal(double value) { 
              this.fractionAboveNormal = new DecimalType();
            this.fractionAboveNormal.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionBelowNormal} (Fraction of samples below normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionBelowNormal" gives direct access to the value
         */
        public DecimalType getFractionBelowNormalElement() { 
          if (this.fractionBelowNormal == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.fractionBelowNormal");
            else if (Configuration.doAutoCreate())
              this.fractionBelowNormal = new DecimalType(); // bb
          return this.fractionBelowNormal;
        }

        public boolean hasFractionBelowNormalElement() { 
          return this.fractionBelowNormal != null && !this.fractionBelowNormal.isEmpty();
        }

        public boolean hasFractionBelowNormal() { 
          return this.fractionBelowNormal != null && !this.fractionBelowNormal.isEmpty();
        }

        /**
         * @param value {@link #fractionBelowNormal} (Fraction of samples below normalized normal range.). This is the underlying object with id, value and extensions. The accessor "getFractionBelowNormal" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormalElement(DecimalType value) { 
          this.fractionBelowNormal = value;
          return this;
        }

        /**
         * @return Fraction of samples below normalized normal range.
         */
        public BigDecimal getFractionBelowNormal() { 
          return this.fractionBelowNormal == null ? null : this.fractionBelowNormal.getValue();
        }

        /**
         * @param value Fraction of samples below normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormal(BigDecimal value) { 
          if (value == null)
            this.fractionBelowNormal = null;
          else {
            if (this.fractionBelowNormal == null)
              this.fractionBelowNormal = new DecimalType();
            this.fractionBelowNormal.setValue(value);
          }
          return this;
        }

        /**
         * @param value Fraction of samples below normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormal(long value) { 
              this.fractionBelowNormal = new DecimalType();
            this.fractionBelowNormal.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of samples below normalized normal range.
         */
        public ClinicalProfileLabScalarDistributionComponent setFractionBelowNormal(double value) { 
              this.fractionBelowNormal = new DecimalType();
            this.fractionBelowNormal.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedLabs} (An ordered list of the laboratory tests  that are most closely correlated.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent getCorrelatedLabs() { 
          if (this.correlatedLabs == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.correlatedLabs");
            else if (Configuration.doAutoCreate())
              this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent(); // cc
          return this.correlatedLabs;
        }

        public boolean hasCorrelatedLabs() { 
          return this.correlatedLabs != null && !this.correlatedLabs.isEmpty();
        }

        /**
         * @param value {@link #correlatedLabs} (An ordered list of the laboratory tests  that are most closely correlated.  This list can be limited by the top "n" labs and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionComponent setCorrelatedLabs(ClinicalProfileLabScalarDistributionCorrelatedLabsComponent value) { 
          this.correlatedLabs = value;
          return this;
        }

        /**
         * @return {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent getCorrelatedDiagnoses() { 
          if (this.correlatedDiagnoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.correlatedDiagnoses");
            else if (Configuration.doAutoCreate())
              this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent(); // cc
          return this.correlatedDiagnoses;
        }

        public boolean hasCorrelatedDiagnoses() { 
          return this.correlatedDiagnoses != null && !this.correlatedDiagnoses.isEmpty();
        }

        /**
         * @param value {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionComponent setCorrelatedDiagnoses(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent value) { 
          this.correlatedDiagnoses = value;
          return this;
        }

        /**
         * @return {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent getCorrelatedMedications() { 
          if (this.correlatedMedications == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.correlatedMedications");
            else if (Configuration.doAutoCreate())
              this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent(); // cc
          return this.correlatedMedications;
        }

        public boolean hasCorrelatedMedications() { 
          return this.correlatedMedications != null && !this.correlatedMedications.isEmpty();
        }

        /**
         * @param value {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionComponent setCorrelatedMedications(ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent value) { 
          this.correlatedMedications = value;
          return this;
        }

        /**
         * @return {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent getCorrelatedProcedures() { 
          if (this.correlatedProcedures == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.correlatedProcedures");
            else if (Configuration.doAutoCreate())
              this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent(); // cc
          return this.correlatedProcedures;
        }

        public boolean hasCorrelatedProcedures() { 
          return this.correlatedProcedures != null && !this.correlatedProcedures.isEmpty();
        }

        /**
         * @param value {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionComponent setCorrelatedProcedures(ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent value) { 
          this.correlatedProcedures = value;
          return this;
        }

        /**
         * @return {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent getCorrelatedPhenotypes() { 
          if (this.correlatedPhenotypes == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionComponent.correlatedPhenotypes");
            else if (Configuration.doAutoCreate())
              this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent(); // cc
          return this.correlatedPhenotypes;
        }

        public boolean hasCorrelatedPhenotypes() { 
          return this.correlatedPhenotypes != null && !this.correlatedPhenotypes.isEmpty();
        }

        /**
         * @param value {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionComponent setCorrelatedPhenotypes(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent value) { 
          this.correlatedPhenotypes = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("units", "SimpleQuantity", "Units of numeric result -- this is not actually a quantity… value is not allowed.", 0, 1, units));
          children.add(new Property("min", "decimal", "The minimum value of this lab for all of the patients in this cohort.", 0, 1, min));
          children.add(new Property("max", "decimal", "The maximum value of this lab for all of the patients in this cohort.", 0, 1, max));
          children.add(new Property("mean", "decimal", "The mean or average value for all of the patients in this cohort.", 0, 1, mean));
          children.add(new Property("median", "decimal", "The median value for all of the patients in this cohort.", 0, 1, median));
          children.add(new Property("stdDev", "decimal", "The standard deviation for all of the patients in this cohort.", 0, 1, stdDev));
          children.add(new Property("decile", "", "Decile partitions.", 0, java.lang.Integer.MAX_VALUE, decile));
          children.add(new Property("normalizedHigh", "decimal", "The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedHigh));
          children.add(new Property("normalizedLow", "decimal", "The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedLow));
          children.add(new Property("fractionAboveNormal", "decimal", "Fraction of samples above normalized normal range.", 0, 1, fractionAboveNormal));
          children.add(new Property("fractionBelowNormal", "decimal", "Fraction of samples below normalized normal range.", 0, 1, fractionBelowNormal));
          children.add(new Property("correlatedLabs", "", "An ordered list of the laboratory tests  that are most closely correlated.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedLabs));
          children.add(new Property("correlatedDiagnoses", "", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses));
          children.add(new Property("correlatedMedications", "", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications));
          children.add(new Property("correlatedProcedures", "", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures));
          children.add(new Property("correlatedPhenotypes", "", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 111433583: /*units*/  return new Property("units", "SimpleQuantity", "Units of numeric result -- this is not actually a quantity… value is not allowed.", 0, 1, units);
          case 108114: /*min*/  return new Property("min", "decimal", "The minimum value of this lab for all of the patients in this cohort.", 0, 1, min);
          case 107876: /*max*/  return new Property("max", "decimal", "The maximum value of this lab for all of the patients in this cohort.", 0, 1, max);
          case 3347397: /*mean*/  return new Property("mean", "decimal", "The mean or average value for all of the patients in this cohort.", 0, 1, mean);
          case -1078031094: /*median*/  return new Property("median", "decimal", "The median value for all of the patients in this cohort.", 0, 1, median);
          case -892438798: /*stdDev*/  return new Property("stdDev", "decimal", "The standard deviation for all of the patients in this cohort.", 0, 1, stdDev);
          case -1335722912: /*decile*/  return new Property("decile", "", "Decile partitions.", 0, java.lang.Integer.MAX_VALUE, decile);
          case -363101895: /*normalizedHigh*/  return new Property("normalizedHigh", "decimal", "The normalized high normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedHigh);
          case -1397182243: /*normalizedLow*/  return new Property("normalizedLow", "decimal", "The normalized low normal range -- for laboratory tests with multiple possible ranges, the normalized normal range is the result of a yet to be specified calculation over this range.", 0, 1, normalizedLow);
          case 1125045122: /*fractionAboveNormal*/  return new Property("fractionAboveNormal", "decimal", "Fraction of samples above normalized normal range.", 0, 1, fractionAboveNormal);
          case -653624042: /*fractionBelowNormal*/  return new Property("fractionBelowNormal", "decimal", "Fraction of samples below normalized normal range.", 0, 1, fractionBelowNormal);
          case 1929642507: /*correlatedLabs*/  return new Property("correlatedLabs", "", "An ordered list of the laboratory tests  that are most closely correlated.  This list can be limited by the top \"n\" labs and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedLabs);
          case -1514511344: /*correlatedDiagnoses*/  return new Property("correlatedDiagnoses", "", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses);
          case -1167241633: /*correlatedMedications*/  return new Property("correlatedMedications", "", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications);
          case -2043850299: /*correlatedProcedures*/  return new Property("correlatedProcedures", "", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures);
          case 76381968: /*correlatedPhenotypes*/  return new Property("correlatedPhenotypes", "", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 111433583: /*units*/ return this.units == null ? new Base[0] : new Base[] {this.units}; // Quantity
        case 108114: /*min*/ return this.min == null ? new Base[0] : new Base[] {this.min}; // DecimalType
        case 107876: /*max*/ return this.max == null ? new Base[0] : new Base[] {this.max}; // DecimalType
        case 3347397: /*mean*/ return this.mean == null ? new Base[0] : new Base[] {this.mean}; // DecimalType
        case -1078031094: /*median*/ return this.median == null ? new Base[0] : new Base[] {this.median}; // DecimalType
        case -892438798: /*stdDev*/ return this.stdDev == null ? new Base[0] : new Base[] {this.stdDev}; // DecimalType
        case -1335722912: /*decile*/ return this.decile == null ? new Base[0] : this.decile.toArray(new Base[this.decile.size()]); // ClinicalProfileLabScalarDistributionDecileComponent
        case -363101895: /*normalizedHigh*/ return this.normalizedHigh == null ? new Base[0] : new Base[] {this.normalizedHigh}; // DecimalType
        case -1397182243: /*normalizedLow*/ return this.normalizedLow == null ? new Base[0] : new Base[] {this.normalizedLow}; // DecimalType
        case 1125045122: /*fractionAboveNormal*/ return this.fractionAboveNormal == null ? new Base[0] : new Base[] {this.fractionAboveNormal}; // DecimalType
        case -653624042: /*fractionBelowNormal*/ return this.fractionBelowNormal == null ? new Base[0] : new Base[] {this.fractionBelowNormal}; // DecimalType
        case 1929642507: /*correlatedLabs*/ return this.correlatedLabs == null ? new Base[0] : new Base[] {this.correlatedLabs}; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        case -1514511344: /*correlatedDiagnoses*/ return this.correlatedDiagnoses == null ? new Base[0] : new Base[] {this.correlatedDiagnoses}; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        case -1167241633: /*correlatedMedications*/ return this.correlatedMedications == null ? new Base[0] : new Base[] {this.correlatedMedications}; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        case -2043850299: /*correlatedProcedures*/ return this.correlatedProcedures == null ? new Base[0] : new Base[] {this.correlatedProcedures}; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        case 76381968: /*correlatedPhenotypes*/ return this.correlatedPhenotypes == null ? new Base[0] : new Base[] {this.correlatedPhenotypes}; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 111433583: // units
          this.units = castToQuantity(value); // Quantity
          return value;
        case 108114: // min
          this.min = castToDecimal(value); // DecimalType
          return value;
        case 107876: // max
          this.max = castToDecimal(value); // DecimalType
          return value;
        case 3347397: // mean
          this.mean = castToDecimal(value); // DecimalType
          return value;
        case -1078031094: // median
          this.median = castToDecimal(value); // DecimalType
          return value;
        case -892438798: // stdDev
          this.stdDev = castToDecimal(value); // DecimalType
          return value;
        case -1335722912: // decile
          this.getDecile().add((ClinicalProfileLabScalarDistributionDecileComponent) value); // ClinicalProfileLabScalarDistributionDecileComponent
          return value;
        case -363101895: // normalizedHigh
          this.normalizedHigh = castToDecimal(value); // DecimalType
          return value;
        case -1397182243: // normalizedLow
          this.normalizedLow = castToDecimal(value); // DecimalType
          return value;
        case 1125045122: // fractionAboveNormal
          this.fractionAboveNormal = castToDecimal(value); // DecimalType
          return value;
        case -653624042: // fractionBelowNormal
          this.fractionBelowNormal = castToDecimal(value); // DecimalType
          return value;
        case 1929642507: // correlatedLabs
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
          return value;
        case -1514511344: // correlatedDiagnoses
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
          return value;
        case -1167241633: // correlatedMedications
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
          return value;
        case -2043850299: // correlatedProcedures
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
          return value;
        case 76381968: // correlatedPhenotypes
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("units")) {
          this.units = castToQuantity(value); // Quantity
        } else if (name.equals("min")) {
          this.min = castToDecimal(value); // DecimalType
        } else if (name.equals("max")) {
          this.max = castToDecimal(value); // DecimalType
        } else if (name.equals("mean")) {
          this.mean = castToDecimal(value); // DecimalType
        } else if (name.equals("median")) {
          this.median = castToDecimal(value); // DecimalType
        } else if (name.equals("stdDev")) {
          this.stdDev = castToDecimal(value); // DecimalType
        } else if (name.equals("decile")) {
          this.getDecile().add((ClinicalProfileLabScalarDistributionDecileComponent) value);
        } else if (name.equals("normalizedHigh")) {
          this.normalizedHigh = castToDecimal(value); // DecimalType
        } else if (name.equals("normalizedLow")) {
          this.normalizedLow = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionAboveNormal")) {
          this.fractionAboveNormal = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionBelowNormal")) {
          this.fractionBelowNormal = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        } else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        } else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        } else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        } else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 111433583:  return getUnits(); 
        case 108114:  return getMinElement();
        case 107876:  return getMaxElement();
        case 3347397:  return getMeanElement();
        case -1078031094:  return getMedianElement();
        case -892438798:  return getStdDevElement();
        case -1335722912:  return addDecile(); 
        case -363101895:  return getNormalizedHighElement();
        case -1397182243:  return getNormalizedLowElement();
        case 1125045122:  return getFractionAboveNormalElement();
        case -653624042:  return getFractionBelowNormalElement();
        case 1929642507:  return getCorrelatedLabs(); 
        case -1514511344:  return getCorrelatedDiagnoses(); 
        case -1167241633:  return getCorrelatedMedications(); 
        case -2043850299:  return getCorrelatedProcedures(); 
        case 76381968:  return getCorrelatedPhenotypes(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 111433583: /*units*/ return new String[] {"SimpleQuantity"};
        case 108114: /*min*/ return new String[] {"decimal"};
        case 107876: /*max*/ return new String[] {"decimal"};
        case 3347397: /*mean*/ return new String[] {"decimal"};
        case -1078031094: /*median*/ return new String[] {"decimal"};
        case -892438798: /*stdDev*/ return new String[] {"decimal"};
        case -1335722912: /*decile*/ return new String[] {};
        case -363101895: /*normalizedHigh*/ return new String[] {"decimal"};
        case -1397182243: /*normalizedLow*/ return new String[] {"decimal"};
        case 1125045122: /*fractionAboveNormal*/ return new String[] {"decimal"};
        case -653624042: /*fractionBelowNormal*/ return new String[] {"decimal"};
        case 1929642507: /*correlatedLabs*/ return new String[] {};
        case -1514511344: /*correlatedDiagnoses*/ return new String[] {};
        case -1167241633: /*correlatedMedications*/ return new String[] {};
        case -2043850299: /*correlatedProcedures*/ return new String[] {};
        case 76381968: /*correlatedPhenotypes*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("units")) {
          this.units = new Quantity();
          return this.units;
        }
        else if (name.equals("min")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.min");
        }
        else if (name.equals("max")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.max");
        }
        else if (name.equals("mean")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.mean");
        }
        else if (name.equals("median")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.median");
        }
        else if (name.equals("stdDev")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.stdDev");
        }
        else if (name.equals("decile")) {
          return addDecile();
        }
        else if (name.equals("normalizedHigh")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.normalizedHigh");
        }
        else if (name.equals("normalizedLow")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.normalizedLow");
        }
        else if (name.equals("fractionAboveNormal")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionAboveNormal");
        }
        else if (name.equals("fractionBelowNormal")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionBelowNormal");
        }
        else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
          return this.correlatedLabs;
        }
        else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent();
          return this.correlatedDiagnoses;
        }
        else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent();
          return this.correlatedMedications;
        }
        else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent();
          return this.correlatedProcedures;
        }
        else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent();
          return this.correlatedPhenotypes;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionComponent copy() {
        ClinicalProfileLabScalarDistributionComponent dst = new ClinicalProfileLabScalarDistributionComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionComponent dst) {
        super.copyValues(dst);
        dst.units = units == null ? null : units.copy();
        dst.min = min == null ? null : min.copy();
        dst.max = max == null ? null : max.copy();
        dst.mean = mean == null ? null : mean.copy();
        dst.median = median == null ? null : median.copy();
        dst.stdDev = stdDev == null ? null : stdDev.copy();
        if (decile != null) {
          dst.decile = new ArrayList<ClinicalProfileLabScalarDistributionDecileComponent>();
          for (ClinicalProfileLabScalarDistributionDecileComponent i : decile)
            dst.decile.add(i.copy());
        };
        dst.normalizedHigh = normalizedHigh == null ? null : normalizedHigh.copy();
        dst.normalizedLow = normalizedLow == null ? null : normalizedLow.copy();
        dst.fractionAboveNormal = fractionAboveNormal == null ? null : fractionAboveNormal.copy();
        dst.fractionBelowNormal = fractionBelowNormal == null ? null : fractionBelowNormal.copy();
        dst.correlatedLabs = correlatedLabs == null ? null : correlatedLabs.copy();
        dst.correlatedDiagnoses = correlatedDiagnoses == null ? null : correlatedDiagnoses.copy();
        dst.correlatedMedications = correlatedMedications == null ? null : correlatedMedications.copy();
        dst.correlatedProcedures = correlatedProcedures == null ? null : correlatedProcedures.copy();
        dst.correlatedPhenotypes = correlatedPhenotypes == null ? null : correlatedPhenotypes.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionComponent))
          return false;
        ClinicalProfileLabScalarDistributionComponent o = (ClinicalProfileLabScalarDistributionComponent) other_;
        return compareDeep(units, o.units, true) && compareDeep(min, o.min, true) && compareDeep(max, o.max, true)
           && compareDeep(mean, o.mean, true) && compareDeep(median, o.median, true) && compareDeep(stdDev, o.stdDev, true)
           && compareDeep(decile, o.decile, true) && compareDeep(normalizedHigh, o.normalizedHigh, true) && compareDeep(normalizedLow, o.normalizedLow, true)
           && compareDeep(fractionAboveNormal, o.fractionAboveNormal, true) && compareDeep(fractionBelowNormal, o.fractionBelowNormal, true)
           && compareDeep(correlatedLabs, o.correlatedLabs, true) && compareDeep(correlatedDiagnoses, o.correlatedDiagnoses, true)
           && compareDeep(correlatedMedications, o.correlatedMedications, true) && compareDeep(correlatedProcedures, o.correlatedProcedures, true)
           && compareDeep(correlatedPhenotypes, o.correlatedPhenotypes, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionComponent))
          return false;
        ClinicalProfileLabScalarDistributionComponent o = (ClinicalProfileLabScalarDistributionComponent) other_;
        return compareValues(min, o.min, true) && compareValues(max, o.max, true) && compareValues(mean, o.mean, true)
           && compareValues(median, o.median, true) && compareValues(stdDev, o.stdDev, true) && compareValues(normalizedHigh, o.normalizedHigh, true)
           && compareValues(normalizedLow, o.normalizedLow, true) && compareValues(fractionAboveNormal, o.fractionAboveNormal, true)
           && compareValues(fractionBelowNormal, o.fractionBelowNormal, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(units, min, max, mean
          , median, stdDev, decile, normalizedHigh, normalizedLow, fractionAboveNormal, fractionBelowNormal
          , correlatedLabs, correlatedDiagnoses, correlatedMedications, correlatedProcedures, correlatedPhenotypes
          );
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionDecileComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Particular decile (10, 20, …).
         */
        @Child(name = "nth", type = {IntegerType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Particular decile (10, 20, …)", formalDefinition="Particular decile (10, 20, …)." )
        protected IntegerType nth;

        /**
         * Cutoff value for this decile.
         */
        @Child(name = "value", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Cutoff value for this decile", formalDefinition="Cutoff value for this decile." )
        protected DecimalType value;

        private static final long serialVersionUID = 508367230L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionDecileComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionDecileComponent(IntegerType nth, DecimalType value) {
        super();
        this.nth = nth;
        this.value = value;
      }

        /**
         * @return {@link #nth} (Particular decile (10, 20, …).). This is the underlying object with id, value and extensions. The accessor "getNth" gives direct access to the value
         */
        public IntegerType getNthElement() { 
          if (this.nth == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionDecileComponent.nth");
            else if (Configuration.doAutoCreate())
              this.nth = new IntegerType(); // bb
          return this.nth;
        }

        public boolean hasNthElement() { 
          return this.nth != null && !this.nth.isEmpty();
        }

        public boolean hasNth() { 
          return this.nth != null && !this.nth.isEmpty();
        }

        /**
         * @param value {@link #nth} (Particular decile (10, 20, …).). This is the underlying object with id, value and extensions. The accessor "getNth" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setNthElement(IntegerType value) { 
          this.nth = value;
          return this;
        }

        /**
         * @return Particular decile (10, 20, …).
         */
        public int getNth() { 
          return this.nth == null || this.nth.isEmpty() ? 0 : this.nth.getValue();
        }

        /**
         * @param value Particular decile (10, 20, …).
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setNth(int value) { 
            if (this.nth == null)
              this.nth = new IntegerType();
            this.nth.setValue(value);
          return this;
        }

        /**
         * @return {@link #value} (Cutoff value for this decile.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public DecimalType getValueElement() { 
          if (this.value == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionDecileComponent.value");
            else if (Configuration.doAutoCreate())
              this.value = new DecimalType(); // bb
          return this.value;
        }

        public boolean hasValueElement() { 
          return this.value != null && !this.value.isEmpty();
        }

        public boolean hasValue() { 
          return this.value != null && !this.value.isEmpty();
        }

        /**
         * @param value {@link #value} (Cutoff value for this decile.). This is the underlying object with id, value and extensions. The accessor "getValue" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValueElement(DecimalType value) { 
          this.value = value;
          return this;
        }

        /**
         * @return Cutoff value for this decile.
         */
        public BigDecimal getValue() { 
          return this.value == null ? null : this.value.getValue();
        }

        /**
         * @param value Cutoff value for this decile.
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValue(BigDecimal value) { 
            if (this.value == null)
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        /**
         * @param value Cutoff value for this decile.
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValue(long value) { 
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        /**
         * @param value Cutoff value for this decile.
         */
        public ClinicalProfileLabScalarDistributionDecileComponent setValue(double value) { 
              this.value = new DecimalType();
            this.value.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("nth", "integer", "Particular decile (10, 20, …).", 0, 1, nth));
          children.add(new Property("value", "decimal", "Cutoff value for this decile.", 0, 1, value));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 109410: /*nth*/  return new Property("nth", "integer", "Particular decile (10, 20, …).", 0, 1, nth);
          case 111972721: /*value*/  return new Property("value", "decimal", "Cutoff value for this decile.", 0, 1, value);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 109410: /*nth*/ return this.nth == null ? new Base[0] : new Base[] {this.nth}; // IntegerType
        case 111972721: /*value*/ return this.value == null ? new Base[0] : new Base[] {this.value}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 109410: // nth
          this.nth = castToInteger(value); // IntegerType
          return value;
        case 111972721: // value
          this.value = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("nth")) {
          this.nth = castToInteger(value); // IntegerType
        } else if (name.equals("value")) {
          this.value = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109410:  return getNthElement();
        case 111972721:  return getValueElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 109410: /*nth*/ return new String[] {"integer"};
        case 111972721: /*value*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("nth")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.nth");
        }
        else if (name.equals("value")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.value");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionDecileComponent copy() {
        ClinicalProfileLabScalarDistributionDecileComponent dst = new ClinicalProfileLabScalarDistributionDecileComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionDecileComponent dst) {
        super.copyValues(dst);
        dst.nth = nth == null ? null : nth.copy();
        dst.value = value == null ? null : value.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionDecileComponent))
          return false;
        ClinicalProfileLabScalarDistributionDecileComponent o = (ClinicalProfileLabScalarDistributionDecileComponent) other_;
        return compareDeep(nth, o.nth, true) && compareDeep(value, o.value, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionDecileComponent))
          return false;
        ClinicalProfileLabScalarDistributionDecileComponent o = (ClinicalProfileLabScalarDistributionDecileComponent) other_;
        return compareValues(nth, o.nth, true) && compareValues(value, o.value, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(nth, value);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.decile";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedLabsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Number of correlations cutoff (e.g. top 10).
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of correlations cutoff (e.g. top 10)", formalDefinition="Number of correlations cutoff (e.g. top 10)." )
        protected IntegerType topn;

        /**
         * Minimum absolute value of correlation coefficient.
         */
        @Child(name = "abscorrelation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Minimum absolute value of correlation coefficient", formalDefinition="Minimum absolute value of correlation coefficient." )
        protected DecimalType abscorrelation;

        /**
         * Correlated lab.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Correlated lab", formalDefinition="Correlated lab." )
        protected List<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent> entry;

        private static final long serialVersionUID = 16637493L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent() {
        super();
      }

        /**
         * @return {@link #topn} (Number of correlations cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (Number of correlations cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return Number of correlations cutoff (e.g. top 10).
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value Number of correlations cutoff (e.g. top 10).
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public DecimalType getAbscorrelationElement() { 
          if (this.abscorrelation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.abscorrelation");
            else if (Configuration.doAutoCreate())
              this.abscorrelation = new DecimalType(); // bb
          return this.abscorrelation;
        }

        public boolean hasAbscorrelationElement() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        public boolean hasAbscorrelation() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        /**
         * @param value {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelationElement(DecimalType value) { 
          this.abscorrelation = value;
          return this;
        }

        /**
         * @return Minimum absolute value of correlation coefficient.
         */
        public BigDecimal getAbscorrelation() { 
          return this.abscorrelation == null ? null : this.abscorrelation.getValue();
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelation(BigDecimal value) { 
          if (value == null)
            this.abscorrelation = null;
          else {
            if (this.abscorrelation == null)
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          }
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelation(long value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setAbscorrelation(double value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (Correlated lab.)
         */
        public List<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent setEntry(List<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent addEntry() { //3
          ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent t = new ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent();
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          this.entry.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent addEntry(ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "Number of correlations cutoff (e.g. top 10).", 0, 1, topn));
          children.add(new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation));
          children.add(new Property("entry", "", "Correlated lab.", 0, java.lang.Integer.MAX_VALUE, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "Number of correlations cutoff (e.g. top 10).", 0, 1, topn);
          case -1112161840: /*abscorrelation*/  return new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation);
          case 96667762: /*entry*/  return new Property("entry", "", "Correlated lab.", 0, java.lang.Integer.MAX_VALUE, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case -1112161840: /*abscorrelation*/ return this.abscorrelation == null ? new Base[0] : new Base[] {this.abscorrelation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case -1112161840: // abscorrelation
          this.abscorrelation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) value); // ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("abscorrelation")) {
          this.abscorrelation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case -1112161840:  return getAbscorrelationElement();
        case 96667762:  return addEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case -1112161840: /*abscorrelation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("abscorrelation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.abscorrelation");
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedLabsComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedLabsComponent dst) {
        super.copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.abscorrelation = abscorrelation == null ? null : abscorrelation.copy();
        if (entry != null) {
          dst.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent>();
          for (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent i : entry)
            dst.entry.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(abscorrelation, o.abscorrelation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(abscorrelation, o.abscorrelation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, abscorrelation, entry
          );
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedLabs";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Lab code (LOINC) or Lab Group Code.
         */
        @Child(name = "labcode", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Lab code (LOINC) or Lab Group Code", formalDefinition="Lab code (LOINC) or Lab Group Code." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/observation-codes")
        protected List<CodeableConcept> labcode;

        /**
         * Correlation coefficient.
         */
        @Child(name = "coefficient", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Correlation coefficient", formalDefinition="Correlation coefficient." )
        protected DecimalType coefficient;

        private static final long serialVersionUID = 119903199L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent(DecimalType coefficient) {
        super();
        this.coefficient = coefficient;
      }

        /**
         * @return {@link #labcode} (Lab code (LOINC) or Lab Group Code.)
         */
        public List<CodeableConcept> getLabcode() { 
          if (this.labcode == null)
            this.labcode = new ArrayList<CodeableConcept>();
          return this.labcode;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setLabcode(List<CodeableConcept> theLabcode) { 
          this.labcode = theLabcode;
          return this;
        }

        public boolean hasLabcode() { 
          if (this.labcode == null)
            return false;
          for (CodeableConcept item : this.labcode)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addLabcode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.labcode == null)
            this.labcode = new ArrayList<CodeableConcept>();
          this.labcode.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent addLabcode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.labcode == null)
            this.labcode = new ArrayList<CodeableConcept>();
          this.labcode.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #labcode}, creating it if it does not already exist
         */
        public CodeableConcept getLabcodeFirstRep() { 
          if (getLabcode().isEmpty()) {
            addLabcode();
          }
          return getLabcode().get(0);
        }

        /**
         * @return {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public DecimalType getCoefficientElement() { 
          if (this.coefficient == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent.coefficient");
            else if (Configuration.doAutoCreate())
              this.coefficient = new DecimalType(); // bb
          return this.coefficient;
        }

        public boolean hasCoefficientElement() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        public boolean hasCoefficient() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        /**
         * @param value {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficientElement(DecimalType value) { 
          this.coefficient = value;
          return this;
        }

        /**
         * @return Correlation coefficient.
         */
        public BigDecimal getCoefficient() { 
          return this.coefficient == null ? null : this.coefficient.getValue();
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficient(BigDecimal value) { 
            if (this.coefficient == null)
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficient(long value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent setCoefficient(double value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("labcode", "CodeableConcept", "Lab code (LOINC) or Lab Group Code.", 0, java.lang.Integer.MAX_VALUE, labcode));
          children.add(new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -63258374: /*labcode*/  return new Property("labcode", "CodeableConcept", "Lab code (LOINC) or Lab Group Code.", 0, java.lang.Integer.MAX_VALUE, labcode);
          case 797813045: /*coefficient*/  return new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -63258374: /*labcode*/ return this.labcode == null ? new Base[0] : this.labcode.toArray(new Base[this.labcode.size()]); // CodeableConcept
        case 797813045: /*coefficient*/ return this.coefficient == null ? new Base[0] : new Base[] {this.coefficient}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -63258374: // labcode
          this.getLabcode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 797813045: // coefficient
          this.coefficient = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("labcode")) {
          this.getLabcode().add(castToCodeableConcept(value));
        } else if (name.equals("coefficient")) {
          this.coefficient = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -63258374:  return addLabcode(); 
        case 797813045:  return getCoefficientElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -63258374: /*labcode*/ return new String[] {"CodeableConcept"};
        case 797813045: /*coefficient*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("labcode")) {
          return addLabcode();
        }
        else if (name.equals("coefficient")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.coefficient");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent dst) {
        super.copyValues(dst);
        if (labcode != null) {
          dst.labcode = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : labcode)
            dst.labcode.add(i.copy());
        };
        dst.coefficient = coefficient == null ? null : coefficient.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) other_;
        return compareDeep(labcode, o.labcode, true) && compareDeep(coefficient, o.coefficient, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedLabsEntryComponent) other_;
        return compareValues(coefficient, o.coefficient, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(labcode, coefficient);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedLabs.entry";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Number of diagnoses cutoff (e.g. top 10).
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of diagnoses cutoff (e.g. top 10)", formalDefinition="Number of diagnoses cutoff (e.g. top 10)." )
        protected IntegerType topn;

        /**
         * Minimum absolute value of correlation coefficient.
         */
        @Child(name = "abscorrelation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Minimum absolute value of correlation coefficient", formalDefinition="Minimum absolute value of correlation coefficient." )
        protected DecimalType abscorrelation;

        /**
         * Correlation entry.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlation entry", formalDefinition="Correlation entry." )
        protected ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent entry;

        private static final long serialVersionUID = -243774208L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent() {
        super();
      }

        /**
         * @return {@link #topn} (Number of diagnoses cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (Number of diagnoses cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return Number of diagnoses cutoff (e.g. top 10).
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value Number of diagnoses cutoff (e.g. top 10).
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public DecimalType getAbscorrelationElement() { 
          if (this.abscorrelation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent.abscorrelation");
            else if (Configuration.doAutoCreate())
              this.abscorrelation = new DecimalType(); // bb
          return this.abscorrelation;
        }

        public boolean hasAbscorrelationElement() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        public boolean hasAbscorrelation() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        /**
         * @param value {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent setAbscorrelationElement(DecimalType value) { 
          this.abscorrelation = value;
          return this;
        }

        /**
         * @return Minimum absolute value of correlation coefficient.
         */
        public BigDecimal getAbscorrelation() { 
          return this.abscorrelation == null ? null : this.abscorrelation.getValue();
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent setAbscorrelation(BigDecimal value) { 
          if (value == null)
            this.abscorrelation = null;
          else {
            if (this.abscorrelation == null)
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          }
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent setAbscorrelation(long value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent setAbscorrelation(double value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (Correlation entry.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent getEntry() { 
          if (this.entry == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent.entry");
            else if (Configuration.doAutoCreate())
              this.entry = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent(); // cc
          return this.entry;
        }

        public boolean hasEntry() { 
          return this.entry != null && !this.entry.isEmpty();
        }

        /**
         * @param value {@link #entry} (Correlation entry.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent setEntry(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent value) { 
          this.entry = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "Number of diagnoses cutoff (e.g. top 10).", 0, 1, topn));
          children.add(new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation));
          children.add(new Property("entry", "", "Correlation entry.", 0, 1, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "Number of diagnoses cutoff (e.g. top 10).", 0, 1, topn);
          case -1112161840: /*abscorrelation*/  return new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation);
          case 96667762: /*entry*/  return new Property("entry", "", "Correlation entry.", 0, 1, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case -1112161840: /*abscorrelation*/ return this.abscorrelation == null ? new Base[0] : new Base[] {this.abscorrelation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : new Base[] {this.entry}; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case -1112161840: // abscorrelation
          this.abscorrelation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.entry = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("abscorrelation")) {
          this.abscorrelation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.entry = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case -1112161840:  return getAbscorrelationElement();
        case 96667762:  return getEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case -1112161840: /*abscorrelation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("abscorrelation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.abscorrelation");
        }
        else if (name.equals("entry")) {
          this.entry = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent();
          return this.entry;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent dst) {
        super.copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.abscorrelation = abscorrelation == null ? null : abscorrelation.copy();
        dst.entry = entry == null ? null : entry.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent o = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(abscorrelation, o.abscorrelation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent o = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(abscorrelation, o.abscorrelation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, abscorrelation, entry
          );
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Diagnosis code(s).
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Diagnosis code(s)", formalDefinition="Diagnosis code(s)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/clinical-findings")
        protected CodeableConcept code;

        /**
         * Correlation coefficient.
         */
        @Child(name = "coefficient", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Correlation coefficient", formalDefinition="Correlation coefficient." )
        protected DecimalType coefficient;

        private static final long serialVersionUID = 1632628516L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent(CodeableConcept code, DecimalType coefficient) {
        super();
        this.code = code;
        this.coefficient = coefficient;
      }

        /**
         * @return {@link #code} (Diagnosis code(s).)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Diagnosis code(s).)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public DecimalType getCoefficientElement() { 
          if (this.coefficient == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent.coefficient");
            else if (Configuration.doAutoCreate())
              this.coefficient = new DecimalType(); // bb
          return this.coefficient;
        }

        public boolean hasCoefficientElement() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        public boolean hasCoefficient() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        /**
         * @param value {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent setCoefficientElement(DecimalType value) { 
          this.coefficient = value;
          return this;
        }

        /**
         * @return Correlation coefficient.
         */
        public BigDecimal getCoefficient() { 
          return this.coefficient == null ? null : this.coefficient.getValue();
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent setCoefficient(BigDecimal value) { 
            if (this.coefficient == null)
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent setCoefficient(long value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent setCoefficient(double value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, 1, code));
          children.add(new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, 1, code);
          case 797813045: /*coefficient*/  return new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case 797813045: /*coefficient*/ return this.coefficient == null ? new Base[0] : new Base[] {this.coefficient}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.code = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 797813045: // coefficient
          this.coefficient = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.code = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("coefficient")) {
          this.coefficient = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCode(); 
        case 797813045:  return getCoefficientElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 797813045: /*coefficient*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("coefficient")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.coefficient");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent dst) {
        super.copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.coefficient = coefficient == null ? null : coefficient.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(coefficient, o.coefficient, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesEntryComponent) other_;
        return compareValues(coefficient, o.coefficient, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, coefficient);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses.entry";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Number of medications cutoff (e.g. top 10).
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of medications cutoff (e.g. top 10)", formalDefinition="Number of medications cutoff (e.g. top 10)." )
        protected IntegerType topn;

        /**
         * Deviation cutoff.
         */
        @Child(name = "deviation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Deviation cutoff", formalDefinition="Deviation cutoff." )
        protected DecimalType deviation;

        /**
         * Correlation entry.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Correlation entry", formalDefinition="Correlation entry." )
        protected List<ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent> entry;

        private static final long serialVersionUID = 1065428674L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent() {
        super();
      }

        /**
         * @return {@link #topn} (Number of medications cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (Number of medications cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return Number of medications cutoff (e.g. top 10).
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value Number of medications cutoff (e.g. top 10).
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #deviation} (Deviation cutoff.). This is the underlying object with id, value and extensions. The accessor "getDeviation" gives direct access to the value
         */
        public DecimalType getDeviationElement() { 
          if (this.deviation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent.deviation");
            else if (Configuration.doAutoCreate())
              this.deviation = new DecimalType(); // bb
          return this.deviation;
        }

        public boolean hasDeviationElement() { 
          return this.deviation != null && !this.deviation.isEmpty();
        }

        public boolean hasDeviation() { 
          return this.deviation != null && !this.deviation.isEmpty();
        }

        /**
         * @param value {@link #deviation} (Deviation cutoff.). This is the underlying object with id, value and extensions. The accessor "getDeviation" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent setDeviationElement(DecimalType value) { 
          this.deviation = value;
          return this;
        }

        /**
         * @return Deviation cutoff.
         */
        public BigDecimal getDeviation() { 
          return this.deviation == null ? null : this.deviation.getValue();
        }

        /**
         * @param value Deviation cutoff.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent setDeviation(BigDecimal value) { 
          if (value == null)
            this.deviation = null;
          else {
            if (this.deviation == null)
              this.deviation = new DecimalType();
            this.deviation.setValue(value);
          }
          return this;
        }

        /**
         * @param value Deviation cutoff.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent setDeviation(long value) { 
              this.deviation = new DecimalType();
            this.deviation.setValue(value);
          return this;
        }

        /**
         * @param value Deviation cutoff.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent setDeviation(double value) { 
              this.deviation = new DecimalType();
            this.deviation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (Correlation entry.)
         */
        public List<ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent setEntry(List<ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent addEntry() { //3
          ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent t = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent();
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent>();
          this.entry.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent addEntry(ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "Number of medications cutoff (e.g. top 10).", 0, 1, topn));
          children.add(new Property("deviation", "decimal", "Deviation cutoff.", 0, 1, deviation));
          children.add(new Property("entry", "", "Correlation entry.", 0, java.lang.Integer.MAX_VALUE, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "Number of medications cutoff (e.g. top 10).", 0, 1, topn);
          case 23819393: /*deviation*/  return new Property("deviation", "decimal", "Deviation cutoff.", 0, 1, deviation);
          case 96667762: /*entry*/  return new Property("entry", "", "Correlation entry.", 0, java.lang.Integer.MAX_VALUE, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case 23819393: /*deviation*/ return this.deviation == null ? new Base[0] : new Base[] {this.deviation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case 23819393: // deviation
          this.deviation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent) value); // ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("deviation")) {
          this.deviation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case 23819393:  return getDeviationElement();
        case 96667762:  return addEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case 23819393: /*deviation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("deviation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.deviation");
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent dst) {
        super.copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.deviation = deviation == null ? null : deviation.copy();
        if (entry != null) {
          dst.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent>();
          for (ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent i : entry)
            dst.entry.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent o = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(deviation, o.deviation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent o = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(deviation, o.deviation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, deviation, entry);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedMedications";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).
         */
        @Child(name = "category", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient))", formalDefinition="Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient))." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/medicationdispense-category")
        protected CodeableConcept category;

        /**
         * Medication code(s).
         */
        @Child(name = "lab", type = {CodeableConcept.class, Medication.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Medication code(s)", formalDefinition="Medication code(s)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/medication-codes")
        protected Type lab;

        /**
         * Correlation coefficient.
         */
        @Child(name = "coefficient", type = {DecimalType.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Correlation coefficient", formalDefinition="Correlation coefficient." )
        protected DecimalType coefficient;

        private static final long serialVersionUID = -1466346880L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent(Type lab, DecimalType coefficient) {
        super();
        this.lab = lab;
        this.coefficient = coefficient;
      }

        /**
         * @return {@link #category} (Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).)
         */
        public CodeableConcept getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new CodeableConcept(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent setCategory(CodeableConcept value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #lab} (Medication code(s).)
         */
        public Type getLab() { 
          return this.lab;
        }

        /**
         * @return {@link #lab} (Medication code(s).)
         */
        public CodeableConcept getLabCodeableConcept() throws FHIRException { 
          if (this.lab == null)
            this.lab = new CodeableConcept();
          if (!(this.lab instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.lab.getClass().getName()+" was encountered");
          return (CodeableConcept) this.lab;
        }

        public boolean hasLabCodeableConcept() { 
          return this != null && this.lab instanceof CodeableConcept;
        }

        /**
         * @return {@link #lab} (Medication code(s).)
         */
        public Reference getLabReference() throws FHIRException { 
          if (this.lab == null)
            this.lab = new Reference();
          if (!(this.lab instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.lab.getClass().getName()+" was encountered");
          return (Reference) this.lab;
        }

        public boolean hasLabReference() { 
          return this != null && this.lab instanceof Reference;
        }

        public boolean hasLab() { 
          return this.lab != null && !this.lab.isEmpty();
        }

        /**
         * @param value {@link #lab} (Medication code(s).)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent setLab(Type value) { 
          if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
            throw new Error("Not the right type for ClinicalProfile.lab.scalarDistribution.correlatedMedications.entry.lab[x]: "+value.fhirType());
          this.lab = value;
          return this;
        }

        /**
         * @return {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public DecimalType getCoefficientElement() { 
          if (this.coefficient == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent.coefficient");
            else if (Configuration.doAutoCreate())
              this.coefficient = new DecimalType(); // bb
          return this.coefficient;
        }

        public boolean hasCoefficientElement() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        public boolean hasCoefficient() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        /**
         * @param value {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent setCoefficientElement(DecimalType value) { 
          this.coefficient = value;
          return this;
        }

        /**
         * @return Correlation coefficient.
         */
        public BigDecimal getCoefficient() { 
          return this.coefficient == null ? null : this.coefficient.getValue();
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent setCoefficient(BigDecimal value) { 
            if (this.coefficient == null)
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent setCoefficient(long value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent setCoefficient(double value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("category", "CodeableConcept", "Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).", 0, 1, category));
          children.add(new Property("lab[x]", "CodeableConcept|Reference(Medication)", "Medication code(s).", 0, 1, lab));
          children.add(new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 50511102: /*category*/  return new Property("category", "CodeableConcept", "Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).", 0, 1, category);
          case -1110426669: /*lab[x]*/  return new Property("lab[x]", "CodeableConcept|Reference(Medication)", "Medication code(s).", 0, 1, lab);
          case 106893: /*lab*/  return new Property("lab[x]", "CodeableConcept|Reference(Medication)", "Medication code(s).", 0, 1, lab);
          case -1828840876: /*labCodeableConcept*/  return new Property("lab[x]", "CodeableConcept|Reference(Medication)", "Medication code(s).", 0, 1, lab);
          case 1845767230: /*labReference*/  return new Property("lab[x]", "CodeableConcept|Reference(Medication)", "Medication code(s).", 0, 1, lab);
          case 797813045: /*coefficient*/  return new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // CodeableConcept
        case 106893: /*lab*/ return this.lab == null ? new Base[0] : new Base[] {this.lab}; // Type
        case 797813045: /*coefficient*/ return this.coefficient == null ? new Base[0] : new Base[] {this.coefficient}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 50511102: // category
          this.category = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 106893: // lab
          this.lab = castToType(value); // Type
          return value;
        case 797813045: // coefficient
          this.coefficient = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("category")) {
          this.category = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("lab[x]")) {
          this.lab = castToType(value); // Type
        } else if (name.equals("coefficient")) {
          this.coefficient = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102:  return getCategory(); 
        case -1110426669:  return getLab(); 
        case 106893:  return getLab(); 
        case 797813045:  return getCoefficientElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case 106893: /*lab*/ return new String[] {"CodeableConcept", "Reference"};
        case 797813045: /*coefficient*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("category")) {
          this.category = new CodeableConcept();
          return this.category;
        }
        else if (name.equals("labCodeableConcept")) {
          this.lab = new CodeableConcept();
          return this.lab;
        }
        else if (name.equals("labReference")) {
          this.lab = new Reference();
          return this.lab;
        }
        else if (name.equals("coefficient")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.coefficient");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent dst) {
        super.copyValues(dst);
        dst.category = category == null ? null : category.copy();
        dst.lab = lab == null ? null : lab.copy();
        dst.coefficient = coefficient == null ? null : coefficient.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent) other_;
        return compareDeep(category, o.category, true) && compareDeep(lab, o.lab, true) && compareDeep(coefficient, o.coefficient, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsEntryComponent) other_;
        return compareValues(coefficient, o.coefficient, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(category, lab, coefficient
          );
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedMedications.entry";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Number of rocedures cutoff (e.g. top 10).
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of rocedures cutoff (e.g. top 10)", formalDefinition="Number of rocedures cutoff (e.g. top 10)." )
        protected IntegerType topn;

        /**
         * Minimum absolute value of correlation coefficient.
         */
        @Child(name = "abscorrelation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Minimum absolute value of correlation coefficient", formalDefinition="Minimum absolute value of correlation coefficient." )
        protected DecimalType abscorrelation;

        /**
         * Correlation entry.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Correlation entry", formalDefinition="Correlation entry." )
        protected List<ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent> entry;

        private static final long serialVersionUID = 387330735L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent() {
        super();
      }

        /**
         * @return {@link #topn} (Number of rocedures cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (Number of rocedures cutoff (e.g. top 10).). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return Number of rocedures cutoff (e.g. top 10).
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value Number of rocedures cutoff (e.g. top 10).
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public DecimalType getAbscorrelationElement() { 
          if (this.abscorrelation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent.abscorrelation");
            else if (Configuration.doAutoCreate())
              this.abscorrelation = new DecimalType(); // bb
          return this.abscorrelation;
        }

        public boolean hasAbscorrelationElement() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        public boolean hasAbscorrelation() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        /**
         * @param value {@link #abscorrelation} (Minimum absolute value of correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent setAbscorrelationElement(DecimalType value) { 
          this.abscorrelation = value;
          return this;
        }

        /**
         * @return Minimum absolute value of correlation coefficient.
         */
        public BigDecimal getAbscorrelation() { 
          return this.abscorrelation == null ? null : this.abscorrelation.getValue();
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent setAbscorrelation(BigDecimal value) { 
          if (value == null)
            this.abscorrelation = null;
          else {
            if (this.abscorrelation == null)
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          }
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent setAbscorrelation(long value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @param value Minimum absolute value of correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent setAbscorrelation(double value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (Correlation entry.)
         */
        public List<ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent setEntry(List<ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent addEntry() { //3
          ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent t = new ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent();
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent>();
          this.entry.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent addEntry(ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "Number of rocedures cutoff (e.g. top 10).", 0, 1, topn));
          children.add(new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation));
          children.add(new Property("entry", "", "Correlation entry.", 0, java.lang.Integer.MAX_VALUE, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "Number of rocedures cutoff (e.g. top 10).", 0, 1, topn);
          case -1112161840: /*abscorrelation*/  return new Property("abscorrelation", "decimal", "Minimum absolute value of correlation coefficient.", 0, 1, abscorrelation);
          case 96667762: /*entry*/  return new Property("entry", "", "Correlation entry.", 0, java.lang.Integer.MAX_VALUE, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case -1112161840: /*abscorrelation*/ return this.abscorrelation == null ? new Base[0] : new Base[] {this.abscorrelation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case -1112161840: // abscorrelation
          this.abscorrelation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent) value); // ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("abscorrelation")) {
          this.abscorrelation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case -1112161840:  return getAbscorrelationElement();
        case 96667762:  return addEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case -1112161840: /*abscorrelation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("abscorrelation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.abscorrelation");
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent dst) {
        super.copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.abscorrelation = abscorrelation == null ? null : abscorrelation.copy();
        if (entry != null) {
          dst.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent>();
          for (ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent i : entry)
            dst.entry.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent o = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(abscorrelation, o.abscorrelation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent o = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(abscorrelation, o.abscorrelation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, abscorrelation, entry
          );
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedProcedures";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Procedure code(s).
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Procedure code(s)", formalDefinition="Procedure code(s)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/procedure-code")
        protected List<CodeableConcept> code;

        /**
         * Correlation coefficient.
         */
        @Child(name = "coefficient", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Correlation coefficient", formalDefinition="Correlation coefficient." )
        protected DecimalType coefficient;

        private static final long serialVersionUID = -226923458L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent(DecimalType coefficient) {
        super();
        this.coefficient = coefficient;
      }

        /**
         * @return {@link #code} (Procedure code(s).)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public DecimalType getCoefficientElement() { 
          if (this.coefficient == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent.coefficient");
            else if (Configuration.doAutoCreate())
              this.coefficient = new DecimalType(); // bb
          return this.coefficient;
        }

        public boolean hasCoefficientElement() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        public boolean hasCoefficient() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        /**
         * @param value {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent setCoefficientElement(DecimalType value) { 
          this.coefficient = value;
          return this;
        }

        /**
         * @return Correlation coefficient.
         */
        public BigDecimal getCoefficient() { 
          return this.coefficient == null ? null : this.coefficient.getValue();
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent setCoefficient(BigDecimal value) { 
            if (this.coefficient == null)
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent setCoefficient(long value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent setCoefficient(double value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Procedure code(s).", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Procedure code(s).", 0, java.lang.Integer.MAX_VALUE, code);
          case 797813045: /*coefficient*/  return new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case 797813045: /*coefficient*/ return this.coefficient == null ? new Base[0] : new Base[] {this.coefficient}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 797813045: // coefficient
          this.coefficient = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("coefficient")) {
          this.coefficient = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case 797813045:  return getCoefficientElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 797813045: /*coefficient*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("coefficient")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.coefficient");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent dst) {
        super.copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.coefficient = coefficient == null ? null : coefficient.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(coefficient, o.coefficient, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedProceduresEntryComponent) other_;
        return compareValues(coefficient, o.coefficient, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, coefficient);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedProcedures.entry";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The maximum number of significant correlated entries that are in this entry.
         */
        @Child(name = "topn", type = {IntegerType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Number of phenotypes cutoff (e.g. top 10)", formalDefinition="The maximum number of significant correlated entries that are in this entry." )
        protected IntegerType topn;

        /**
         * The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.
         */
        @Child(name = "abscorrelation", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Minimum absolute value of correlation coefficient", formalDefinition="The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list." )
        protected DecimalType abscorrelation;

        /**
         * List of correlated phenotypes in descending order of the absolute value of the correlation coefficient.
         */
        @Child(name = "entry", type = {}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Correlation entry", formalDefinition="List of correlated phenotypes in descending order of the absolute value of the correlation coefficient." )
        protected List<ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent> entry;

        private static final long serialVersionUID = -1390022918L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent() {
        super();
      }

        /**
         * @return {@link #topn} (The maximum number of significant correlated entries that are in this entry.). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public IntegerType getTopnElement() { 
          if (this.topn == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent.topn");
            else if (Configuration.doAutoCreate())
              this.topn = new IntegerType(); // bb
          return this.topn;
        }

        public boolean hasTopnElement() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        public boolean hasTopn() { 
          return this.topn != null && !this.topn.isEmpty();
        }

        /**
         * @param value {@link #topn} (The maximum number of significant correlated entries that are in this entry.). This is the underlying object with id, value and extensions. The accessor "getTopn" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent setTopnElement(IntegerType value) { 
          this.topn = value;
          return this;
        }

        /**
         * @return The maximum number of significant correlated entries that are in this entry.
         */
        public int getTopn() { 
          return this.topn == null || this.topn.isEmpty() ? 0 : this.topn.getValue();
        }

        /**
         * @param value The maximum number of significant correlated entries that are in this entry.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent setTopn(int value) { 
            if (this.topn == null)
              this.topn = new IntegerType();
            this.topn.setValue(value);
          return this;
        }

        /**
         * @return {@link #abscorrelation} (The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public DecimalType getAbscorrelationElement() { 
          if (this.abscorrelation == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent.abscorrelation");
            else if (Configuration.doAutoCreate())
              this.abscorrelation = new DecimalType(); // bb
          return this.abscorrelation;
        }

        public boolean hasAbscorrelationElement() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        public boolean hasAbscorrelation() { 
          return this.abscorrelation != null && !this.abscorrelation.isEmpty();
        }

        /**
         * @param value {@link #abscorrelation} (The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.). This is the underlying object with id, value and extensions. The accessor "getAbscorrelation" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent setAbscorrelationElement(DecimalType value) { 
          this.abscorrelation = value;
          return this;
        }

        /**
         * @return The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.
         */
        public BigDecimal getAbscorrelation() { 
          return this.abscorrelation == null ? null : this.abscorrelation.getValue();
        }

        /**
         * @param value The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent setAbscorrelation(BigDecimal value) { 
          if (value == null)
            this.abscorrelation = null;
          else {
            if (this.abscorrelation == null)
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          }
          return this;
        }

        /**
         * @param value The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent setAbscorrelation(long value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @param value The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent setAbscorrelation(double value) { 
              this.abscorrelation = new DecimalType();
            this.abscorrelation.setValue(value);
          return this;
        }

        /**
         * @return {@link #entry} (List of correlated phenotypes in descending order of the absolute value of the correlation coefficient.)
         */
        public List<ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent> getEntry() { 
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent>();
          return this.entry;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent setEntry(List<ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent> theEntry) { 
          this.entry = theEntry;
          return this;
        }

        public boolean hasEntry() { 
          if (this.entry == null)
            return false;
          for (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent item : this.entry)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent addEntry() { //3
          ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent t = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent();
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent>();
          this.entry.add(t);
          return t;
        }

        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent addEntry(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent t) { //3
          if (t == null)
            return this;
          if (this.entry == null)
            this.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent>();
          this.entry.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #entry}, creating it if it does not already exist
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent getEntryFirstRep() { 
          if (getEntry().isEmpty()) {
            addEntry();
          }
          return getEntry().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("topn", "integer", "The maximum number of significant correlated entries that are in this entry.", 0, 1, topn));
          children.add(new Property("abscorrelation", "decimal", "The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.", 0, 1, abscorrelation));
          children.add(new Property("entry", "", "List of correlated phenotypes in descending order of the absolute value of the correlation coefficient.", 0, java.lang.Integer.MAX_VALUE, entry));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3566009: /*topn*/  return new Property("topn", "integer", "The maximum number of significant correlated entries that are in this entry.", 0, 1, topn);
          case -1112161840: /*abscorrelation*/  return new Property("abscorrelation", "decimal", "The cutoff value for correlation coefficients.  Entries with an absolute value less than this are not included in the list.", 0, 1, abscorrelation);
          case 96667762: /*entry*/  return new Property("entry", "", "List of correlated phenotypes in descending order of the absolute value of the correlation coefficient.", 0, java.lang.Integer.MAX_VALUE, entry);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return this.topn == null ? new Base[0] : new Base[] {this.topn}; // IntegerType
        case -1112161840: /*abscorrelation*/ return this.abscorrelation == null ? new Base[0] : new Base[] {this.abscorrelation}; // DecimalType
        case 96667762: /*entry*/ return this.entry == null ? new Base[0] : this.entry.toArray(new Base[this.entry.size()]); // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3566009: // topn
          this.topn = castToInteger(value); // IntegerType
          return value;
        case -1112161840: // abscorrelation
          this.abscorrelation = castToDecimal(value); // DecimalType
          return value;
        case 96667762: // entry
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent) value); // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("topn")) {
          this.topn = castToInteger(value); // IntegerType
        } else if (name.equals("abscorrelation")) {
          this.abscorrelation = castToDecimal(value); // DecimalType
        } else if (name.equals("entry")) {
          this.getEntry().add((ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009:  return getTopnElement();
        case -1112161840:  return getAbscorrelationElement();
        case 96667762:  return addEntry(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3566009: /*topn*/ return new String[] {"integer"};
        case -1112161840: /*abscorrelation*/ return new String[] {"decimal"};
        case 96667762: /*entry*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("topn")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.topn");
        }
        else if (name.equals("abscorrelation")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.abscorrelation");
        }
        else if (name.equals("entry")) {
          return addEntry();
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent dst) {
        super.copyValues(dst);
        dst.topn = topn == null ? null : topn.copy();
        dst.abscorrelation = abscorrelation == null ? null : abscorrelation.copy();
        if (entry != null) {
          dst.entry = new ArrayList<ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent>();
          for (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent i : entry)
            dst.entry.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent o = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) other_;
        return compareDeep(topn, o.topn, true) && compareDeep(abscorrelation, o.abscorrelation, true) && compareDeep(entry, o.entry, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent o = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) other_;
        return compareValues(topn, o.topn, true) && compareValues(abscorrelation, o.abscorrelation, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(topn, abscorrelation, entry
          );
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes";

  }

  }

    @Block()
    public static class ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Phenotype(s).  More than one code is considered a group or aggregation.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Phenotype codes", formalDefinition="Phenotype(s).  More than one code is considered a group or aggregation." )
        protected CodeableConcept code;

        /**
         * Correlation coefficient.
         */
        @Child(name = "coefficient", type = {DecimalType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Correlation coefficient", formalDefinition="Correlation coefficient." )
        protected DecimalType coefficient;

        private static final long serialVersionUID = 1632628516L;

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent(CodeableConcept code, DecimalType coefficient) {
        super();
        this.code = code;
        this.coefficient = coefficient;
      }

        /**
         * @return {@link #code} (Phenotype(s).  More than one code is considered a group or aggregation.)
         */
        public CodeableConcept getCode() { 
          if (this.code == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent.code");
            else if (Configuration.doAutoCreate())
              this.code = new CodeableConcept(); // cc
          return this.code;
        }

        public boolean hasCode() { 
          return this.code != null && !this.code.isEmpty();
        }

        /**
         * @param value {@link #code} (Phenotype(s).  More than one code is considered a group or aggregation.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent setCode(CodeableConcept value) { 
          this.code = value;
          return this;
        }

        /**
         * @return {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public DecimalType getCoefficientElement() { 
          if (this.coefficient == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent.coefficient");
            else if (Configuration.doAutoCreate())
              this.coefficient = new DecimalType(); // bb
          return this.coefficient;
        }

        public boolean hasCoefficientElement() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        public boolean hasCoefficient() { 
          return this.coefficient != null && !this.coefficient.isEmpty();
        }

        /**
         * @param value {@link #coefficient} (Correlation coefficient.). This is the underlying object with id, value and extensions. The accessor "getCoefficient" gives direct access to the value
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent setCoefficientElement(DecimalType value) { 
          this.coefficient = value;
          return this;
        }

        /**
         * @return Correlation coefficient.
         */
        public BigDecimal getCoefficient() { 
          return this.coefficient == null ? null : this.coefficient.getValue();
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent setCoefficient(BigDecimal value) { 
            if (this.coefficient == null)
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent setCoefficient(long value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        /**
         * @param value Correlation coefficient.
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent setCoefficient(double value) { 
              this.coefficient = new DecimalType();
            this.coefficient.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Phenotype(s).  More than one code is considered a group or aggregation.", 0, 1, code));
          children.add(new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Phenotype(s).  More than one code is considered a group or aggregation.", 0, 1, code);
          case 797813045: /*coefficient*/  return new Property("coefficient", "decimal", "Correlation coefficient.", 0, 1, coefficient);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : new Base[] {this.code}; // CodeableConcept
        case 797813045: /*coefficient*/ return this.coefficient == null ? new Base[0] : new Base[] {this.coefficient}; // DecimalType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.code = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 797813045: // coefficient
          this.coefficient = castToDecimal(value); // DecimalType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.code = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("coefficient")) {
          this.coefficient = castToDecimal(value); // DecimalType
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return getCode(); 
        case 797813045:  return getCoefficientElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 797813045: /*coefficient*/ return new String[] {"decimal"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          this.code = new CodeableConcept();
          return this.code;
        }
        else if (name.equals("coefficient")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.coefficient");
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent copy() {
        ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent dst = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent dst) {
        super.copyValues(dst);
        dst.code = code == null ? null : code.copy();
        dst.coefficient = coefficient == null ? null : coefficient.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(coefficient, o.coefficient, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent))
          return false;
        ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent o = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesEntryComponent) other_;
        return compareValues(coefficient, o.coefficient, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, coefficient);
      }

  public String fhirType() {
    return "ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes.entry";

  }

  }

    @Block()
    public static class ClinicalProfileMedicationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).
         */
        @Child(name = "category", type = {CodeableConcept.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient))", formalDefinition="Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient))." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/medicationdispense-category")
        protected CodeableConcept category;

        /**
         * Medication(s) being profiled.
         */
        @Child(name = "medication", type = {CodeableConcept.class, Medication.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Medication(s) being profiled", formalDefinition="Medication(s) being profiled." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/medication-codes")
        protected Type medication;

        /**
         * Details of how medication was taken.
         */
        @Child(name = "dosage", type = {}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Details of how medication was taken", formalDefinition="Details of how medication was taken." )
        protected ClinicalProfileMedicationDosageComponent dosage;

        /**
         * Needs clarification.
         */
        @Child(name = "treatementDuration", type = {DecimalType.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Duration of treatment (in 1 year)", formalDefinition="Needs clarification." )
        protected DecimalType treatementDuration;

        /**
         * Frequency of treatments per patient per year.
         */
        @Child(name = "frequencyPerYear", type = {DecimalType.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Frequency of treatments per patient per year", formalDefinition="Frequency of treatments per patient per year." )
        protected DecimalType frequencyPerYear;

        /**
         * Fraction of patients in cohort treated with this drug.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=6, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Fraction of patients in cohort treated with this drug", formalDefinition="Fraction of patients in cohort treated with this drug." )
        protected DecimalType fractionOfSubjects;

        /**
         * Correlated labs.
         */
        @Child(name = "correlatedLabs", type = {ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated labs", formalDefinition="Correlated labs." )
        protected ClinicalProfileLabScalarDistributionCorrelatedLabsComponent correlatedLabs;

        /**
         * An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedDiagnoses", type = {ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated diagnosies", formalDefinition="An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent correlatedDiagnoses;

        /**
         * An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedMedications", type = {ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated medications", formalDefinition="An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent correlatedMedications;

        /**
         * An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedProcedures", type = {ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent.class}, order=10, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated procedures", formalDefinition="An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent correlatedProcedures;

        /**
         * An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedPhenotypes", type = {ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent.class}, order=11, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated phenotypes", formalDefinition="An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent correlatedPhenotypes;

        private static final long serialVersionUID = 1083869360L;

    /**
     * Constructor
     */
      public ClinicalProfileMedicationComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileMedicationComponent(Type medication, DecimalType fractionOfSubjects) {
        super();
        this.medication = medication;
        this.fractionOfSubjects = fractionOfSubjects;
      }

        /**
         * @return {@link #category} (Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).)
         */
        public CodeableConcept getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new CodeableConcept(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).)
         */
        public ClinicalProfileMedicationComponent setCategory(CodeableConcept value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #medication} (Medication(s) being profiled.)
         */
        public Type getMedication() { 
          return this.medication;
        }

        /**
         * @return {@link #medication} (Medication(s) being profiled.)
         */
        public CodeableConcept getMedicationCodeableConcept() throws FHIRException { 
          if (this.medication == null)
            this.medication = new CodeableConcept();
          if (!(this.medication instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.medication.getClass().getName()+" was encountered");
          return (CodeableConcept) this.medication;
        }

        public boolean hasMedicationCodeableConcept() { 
          return this != null && this.medication instanceof CodeableConcept;
        }

        /**
         * @return {@link #medication} (Medication(s) being profiled.)
         */
        public Reference getMedicationReference() throws FHIRException { 
          if (this.medication == null)
            this.medication = new Reference();
          if (!(this.medication instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.medication.getClass().getName()+" was encountered");
          return (Reference) this.medication;
        }

        public boolean hasMedicationReference() { 
          return this != null && this.medication instanceof Reference;
        }

        public boolean hasMedication() { 
          return this.medication != null && !this.medication.isEmpty();
        }

        /**
         * @param value {@link #medication} (Medication(s) being profiled.)
         */
        public ClinicalProfileMedicationComponent setMedication(Type value) { 
          if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
            throw new Error("Not the right type for ClinicalProfile.medication.medication[x]: "+value.fhirType());
          this.medication = value;
          return this;
        }

        /**
         * @return {@link #dosage} (Details of how medication was taken.)
         */
        public ClinicalProfileMedicationDosageComponent getDosage() { 
          if (this.dosage == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.dosage");
            else if (Configuration.doAutoCreate())
              this.dosage = new ClinicalProfileMedicationDosageComponent(); // cc
          return this.dosage;
        }

        public boolean hasDosage() { 
          return this.dosage != null && !this.dosage.isEmpty();
        }

        /**
         * @param value {@link #dosage} (Details of how medication was taken.)
         */
        public ClinicalProfileMedicationComponent setDosage(ClinicalProfileMedicationDosageComponent value) { 
          this.dosage = value;
          return this;
        }

        /**
         * @return {@link #treatementDuration} (Needs clarification.). This is the underlying object with id, value and extensions. The accessor "getTreatementDuration" gives direct access to the value
         */
        public DecimalType getTreatementDurationElement() { 
          if (this.treatementDuration == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.treatementDuration");
            else if (Configuration.doAutoCreate())
              this.treatementDuration = new DecimalType(); // bb
          return this.treatementDuration;
        }

        public boolean hasTreatementDurationElement() { 
          return this.treatementDuration != null && !this.treatementDuration.isEmpty();
        }

        public boolean hasTreatementDuration() { 
          return this.treatementDuration != null && !this.treatementDuration.isEmpty();
        }

        /**
         * @param value {@link #treatementDuration} (Needs clarification.). This is the underlying object with id, value and extensions. The accessor "getTreatementDuration" gives direct access to the value
         */
        public ClinicalProfileMedicationComponent setTreatementDurationElement(DecimalType value) { 
          this.treatementDuration = value;
          return this;
        }

        /**
         * @return Needs clarification.
         */
        public BigDecimal getTreatementDuration() { 
          return this.treatementDuration == null ? null : this.treatementDuration.getValue();
        }

        /**
         * @param value Needs clarification.
         */
        public ClinicalProfileMedicationComponent setTreatementDuration(BigDecimal value) { 
          if (value == null)
            this.treatementDuration = null;
          else {
            if (this.treatementDuration == null)
              this.treatementDuration = new DecimalType();
            this.treatementDuration.setValue(value);
          }
          return this;
        }

        /**
         * @param value Needs clarification.
         */
        public ClinicalProfileMedicationComponent setTreatementDuration(long value) { 
              this.treatementDuration = new DecimalType();
            this.treatementDuration.setValue(value);
          return this;
        }

        /**
         * @param value Needs clarification.
         */
        public ClinicalProfileMedicationComponent setTreatementDuration(double value) { 
              this.treatementDuration = new DecimalType();
            this.treatementDuration.setValue(value);
          return this;
        }

        /**
         * @return {@link #frequencyPerYear} (Frequency of treatments per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public DecimalType getFrequencyPerYearElement() { 
          if (this.frequencyPerYear == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.frequencyPerYear");
            else if (Configuration.doAutoCreate())
              this.frequencyPerYear = new DecimalType(); // bb
          return this.frequencyPerYear;
        }

        public boolean hasFrequencyPerYearElement() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        public boolean hasFrequencyPerYear() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        /**
         * @param value {@link #frequencyPerYear} (Frequency of treatments per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public ClinicalProfileMedicationComponent setFrequencyPerYearElement(DecimalType value) { 
          this.frequencyPerYear = value;
          return this;
        }

        /**
         * @return Frequency of treatments per patient per year.
         */
        public BigDecimal getFrequencyPerYear() { 
          return this.frequencyPerYear == null ? null : this.frequencyPerYear.getValue();
        }

        /**
         * @param value Frequency of treatments per patient per year.
         */
        public ClinicalProfileMedicationComponent setFrequencyPerYear(BigDecimal value) { 
          if (value == null)
            this.frequencyPerYear = null;
          else {
            if (this.frequencyPerYear == null)
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          }
          return this;
        }

        /**
         * @param value Frequency of treatments per patient per year.
         */
        public ClinicalProfileMedicationComponent setFrequencyPerYear(long value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @param value Frequency of treatments per patient per year.
         */
        public ClinicalProfileMedicationComponent setFrequencyPerYear(double value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionOfSubjects} (Fraction of patients in cohort treated with this drug.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (Fraction of patients in cohort treated with this drug.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return Fraction of patients in cohort treated with this drug.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value Fraction of patients in cohort treated with this drug.
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjects(BigDecimal value) { 
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients in cohort treated with this drug.
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients in cohort treated with this drug.
         */
        public ClinicalProfileMedicationComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent getCorrelatedLabs() { 
          if (this.correlatedLabs == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.correlatedLabs");
            else if (Configuration.doAutoCreate())
              this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent(); // cc
          return this.correlatedLabs;
        }

        public boolean hasCorrelatedLabs() { 
          return this.correlatedLabs != null && !this.correlatedLabs.isEmpty();
        }

        /**
         * @param value {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileMedicationComponent setCorrelatedLabs(ClinicalProfileLabScalarDistributionCorrelatedLabsComponent value) { 
          this.correlatedLabs = value;
          return this;
        }

        /**
         * @return {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent getCorrelatedDiagnoses() { 
          if (this.correlatedDiagnoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.correlatedDiagnoses");
            else if (Configuration.doAutoCreate())
              this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent(); // cc
          return this.correlatedDiagnoses;
        }

        public boolean hasCorrelatedDiagnoses() { 
          return this.correlatedDiagnoses != null && !this.correlatedDiagnoses.isEmpty();
        }

        /**
         * @param value {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileMedicationComponent setCorrelatedDiagnoses(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent value) { 
          this.correlatedDiagnoses = value;
          return this;
        }

        /**
         * @return {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent getCorrelatedMedications() { 
          if (this.correlatedMedications == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.correlatedMedications");
            else if (Configuration.doAutoCreate())
              this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent(); // cc
          return this.correlatedMedications;
        }

        public boolean hasCorrelatedMedications() { 
          return this.correlatedMedications != null && !this.correlatedMedications.isEmpty();
        }

        /**
         * @param value {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileMedicationComponent setCorrelatedMedications(ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent value) { 
          this.correlatedMedications = value;
          return this;
        }

        /**
         * @return {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent getCorrelatedProcedures() { 
          if (this.correlatedProcedures == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.correlatedProcedures");
            else if (Configuration.doAutoCreate())
              this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent(); // cc
          return this.correlatedProcedures;
        }

        public boolean hasCorrelatedProcedures() { 
          return this.correlatedProcedures != null && !this.correlatedProcedures.isEmpty();
        }

        /**
         * @param value {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileMedicationComponent setCorrelatedProcedures(ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent value) { 
          this.correlatedProcedures = value;
          return this;
        }

        /**
         * @return {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent getCorrelatedPhenotypes() { 
          if (this.correlatedPhenotypes == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationComponent.correlatedPhenotypes");
            else if (Configuration.doAutoCreate())
              this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent(); // cc
          return this.correlatedPhenotypes;
        }

        public boolean hasCorrelatedPhenotypes() { 
          return this.correlatedPhenotypes != null && !this.correlatedPhenotypes.isEmpty();
        }

        /**
         * @param value {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileMedicationComponent setCorrelatedPhenotypes(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent value) { 
          this.correlatedPhenotypes = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("category", "CodeableConcept", "Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).", 0, 1, category));
          children.add(new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication));
          children.add(new Property("dosage", "", "Details of how medication was taken.", 0, 1, dosage));
          children.add(new Property("treatementDuration", "decimal", "Needs clarification.", 0, 1, treatementDuration));
          children.add(new Property("frequencyPerYear", "decimal", "Frequency of treatments per patient per year.", 0, 1, frequencyPerYear));
          children.add(new Property("fractionOfSubjects", "decimal", "Fraction of patients in cohort treated with this drug.", 0, 1, fractionOfSubjects));
          children.add(new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs));
          children.add(new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses));
          children.add(new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications));
          children.add(new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures));
          children.add(new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 50511102: /*category*/  return new Property("category", "CodeableConcept", "Indicates the type of medication dispense (for example, where the medication is expected to be consumed or administered (i.e. inpatient or outpatient)).", 0, 1, category);
          case 1458402129: /*medication[x]*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case 1998965455: /*medication*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case -209845038: /*medicationCodeableConcept*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case 2104315196: /*medicationReference*/  return new Property("medication[x]", "CodeableConcept|Reference(Medication)", "Medication(s) being profiled.", 0, 1, medication);
          case -1326018889: /*dosage*/  return new Property("dosage", "", "Details of how medication was taken.", 0, 1, dosage);
          case 858625053: /*treatementDuration*/  return new Property("treatementDuration", "decimal", "Needs clarification.", 0, 1, treatementDuration);
          case 751135230: /*frequencyPerYear*/  return new Property("frequencyPerYear", "decimal", "Frequency of treatments per patient per year.", 0, 1, frequencyPerYear);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "Fraction of patients in cohort treated with this drug.", 0, 1, fractionOfSubjects);
          case 1929642507: /*correlatedLabs*/  return new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs);
          case -1514511344: /*correlatedDiagnoses*/  return new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses);
          case -1167241633: /*correlatedMedications*/  return new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications);
          case -2043850299: /*correlatedProcedures*/  return new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures);
          case 76381968: /*correlatedPhenotypes*/  return new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // CodeableConcept
        case 1998965455: /*medication*/ return this.medication == null ? new Base[0] : new Base[] {this.medication}; // Type
        case -1326018889: /*dosage*/ return this.dosage == null ? new Base[0] : new Base[] {this.dosage}; // ClinicalProfileMedicationDosageComponent
        case 858625053: /*treatementDuration*/ return this.treatementDuration == null ? new Base[0] : new Base[] {this.treatementDuration}; // DecimalType
        case 751135230: /*frequencyPerYear*/ return this.frequencyPerYear == null ? new Base[0] : new Base[] {this.frequencyPerYear}; // DecimalType
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case 1929642507: /*correlatedLabs*/ return this.correlatedLabs == null ? new Base[0] : new Base[] {this.correlatedLabs}; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        case -1514511344: /*correlatedDiagnoses*/ return this.correlatedDiagnoses == null ? new Base[0] : new Base[] {this.correlatedDiagnoses}; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        case -1167241633: /*correlatedMedications*/ return this.correlatedMedications == null ? new Base[0] : new Base[] {this.correlatedMedications}; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        case -2043850299: /*correlatedProcedures*/ return this.correlatedProcedures == null ? new Base[0] : new Base[] {this.correlatedProcedures}; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        case 76381968: /*correlatedPhenotypes*/ return this.correlatedPhenotypes == null ? new Base[0] : new Base[] {this.correlatedPhenotypes}; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 50511102: // category
          this.category = castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1998965455: // medication
          this.medication = castToType(value); // Type
          return value;
        case -1326018889: // dosage
          this.dosage = (ClinicalProfileMedicationDosageComponent) value; // ClinicalProfileMedicationDosageComponent
          return value;
        case 858625053: // treatementDuration
          this.treatementDuration = castToDecimal(value); // DecimalType
          return value;
        case 751135230: // frequencyPerYear
          this.frequencyPerYear = castToDecimal(value); // DecimalType
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case 1929642507: // correlatedLabs
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
          return value;
        case -1514511344: // correlatedDiagnoses
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
          return value;
        case -1167241633: // correlatedMedications
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
          return value;
        case -2043850299: // correlatedProcedures
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
          return value;
        case 76381968: // correlatedPhenotypes
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("category")) {
          this.category = castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("medication[x]")) {
          this.medication = castToType(value); // Type
        } else if (name.equals("dosage")) {
          this.dosage = (ClinicalProfileMedicationDosageComponent) value; // ClinicalProfileMedicationDosageComponent
        } else if (name.equals("treatementDuration")) {
          this.treatementDuration = castToDecimal(value); // DecimalType
        } else if (name.equals("frequencyPerYear")) {
          this.frequencyPerYear = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        } else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        } else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        } else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        } else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102:  return getCategory(); 
        case 1458402129:  return getMedication(); 
        case 1998965455:  return getMedication(); 
        case -1326018889:  return getDosage(); 
        case 858625053:  return getTreatementDurationElement();
        case 751135230:  return getFrequencyPerYearElement();
        case -254443680:  return getFractionOfSubjectsElement();
        case 1929642507:  return getCorrelatedLabs(); 
        case -1514511344:  return getCorrelatedDiagnoses(); 
        case -1167241633:  return getCorrelatedMedications(); 
        case -2043850299:  return getCorrelatedProcedures(); 
        case 76381968:  return getCorrelatedPhenotypes(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case 1998965455: /*medication*/ return new String[] {"CodeableConcept", "Reference"};
        case -1326018889: /*dosage*/ return new String[] {};
        case 858625053: /*treatementDuration*/ return new String[] {"decimal"};
        case 751135230: /*frequencyPerYear*/ return new String[] {"decimal"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case 1929642507: /*correlatedLabs*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedLabs"};
        case -1514511344: /*correlatedDiagnoses*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses"};
        case -1167241633: /*correlatedMedications*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedMedications"};
        case -2043850299: /*correlatedProcedures*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedProcedures"};
        case 76381968: /*correlatedPhenotypes*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("category")) {
          this.category = new CodeableConcept();
          return this.category;
        }
        else if (name.equals("medicationCodeableConcept")) {
          this.medication = new CodeableConcept();
          return this.medication;
        }
        else if (name.equals("medicationReference")) {
          this.medication = new Reference();
          return this.medication;
        }
        else if (name.equals("dosage")) {
          this.dosage = new ClinicalProfileMedicationDosageComponent();
          return this.dosage;
        }
        else if (name.equals("treatementDuration")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.treatementDuration");
        }
        else if (name.equals("frequencyPerYear")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.frequencyPerYear");
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
          return this.correlatedLabs;
        }
        else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent();
          return this.correlatedDiagnoses;
        }
        else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent();
          return this.correlatedMedications;
        }
        else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent();
          return this.correlatedProcedures;
        }
        else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent();
          return this.correlatedPhenotypes;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileMedicationComponent copy() {
        ClinicalProfileMedicationComponent dst = new ClinicalProfileMedicationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileMedicationComponent dst) {
        super.copyValues(dst);
        dst.category = category == null ? null : category.copy();
        dst.medication = medication == null ? null : medication.copy();
        dst.dosage = dosage == null ? null : dosage.copy();
        dst.treatementDuration = treatementDuration == null ? null : treatementDuration.copy();
        dst.frequencyPerYear = frequencyPerYear == null ? null : frequencyPerYear.copy();
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.correlatedLabs = correlatedLabs == null ? null : correlatedLabs.copy();
        dst.correlatedDiagnoses = correlatedDiagnoses == null ? null : correlatedDiagnoses.copy();
        dst.correlatedMedications = correlatedMedications == null ? null : correlatedMedications.copy();
        dst.correlatedProcedures = correlatedProcedures == null ? null : correlatedProcedures.copy();
        dst.correlatedPhenotypes = correlatedPhenotypes == null ? null : correlatedPhenotypes.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationComponent))
          return false;
        ClinicalProfileMedicationComponent o = (ClinicalProfileMedicationComponent) other_;
        return compareDeep(category, o.category, true) && compareDeep(medication, o.medication, true) && compareDeep(dosage, o.dosage, true)
           && compareDeep(treatementDuration, o.treatementDuration, true) && compareDeep(frequencyPerYear, o.frequencyPerYear, true)
           && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true) && compareDeep(correlatedLabs, o.correlatedLabs, true)
           && compareDeep(correlatedDiagnoses, o.correlatedDiagnoses, true) && compareDeep(correlatedMedications, o.correlatedMedications, true)
           && compareDeep(correlatedProcedures, o.correlatedProcedures, true) && compareDeep(correlatedPhenotypes, o.correlatedPhenotypes, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationComponent))
          return false;
        ClinicalProfileMedicationComponent o = (ClinicalProfileMedicationComponent) other_;
        return compareValues(treatementDuration, o.treatementDuration, true) && compareValues(frequencyPerYear, o.frequencyPerYear, true)
           && compareValues(fractionOfSubjects, o.fractionOfSubjects, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(category, medication, dosage
          , treatementDuration, frequencyPerYear, fractionOfSubjects, correlatedLabs, correlatedDiagnoses
          , correlatedMedications, correlatedProcedures, correlatedPhenotypes);
      }

  public String fhirType() {
    return "ClinicalProfile.medication";

  }

  }

    @Block()
    public static class ClinicalProfileMedicationDosageComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Free text dosage instructions e.g. SIG.
         */
        @Child(name = "text", type = {StringType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Free text dosage instructions e.g. SIG", formalDefinition="Free text dosage instructions e.g. SIG." )
        protected StringType text;

        /**
         * Body site(s) administered to.
         */
        @Child(name = "site", type = {CodeableConcept.class}, order=2, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Body site(s) administered to", formalDefinition="Body site(s) administered to." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/approach-site-codes")
        protected List<CodeableConcept> site;

        /**
         * Path(s) of substance into body.
         */
        @Child(name = "route", type = {CodeableConcept.class}, order=3, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Path(s) of substance into body", formalDefinition="Path(s) of substance into body." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/route-codes")
        protected List<CodeableConcept> route;

        /**
         * How the drug was administered.
         */
        @Child(name = "method", type = {CodeableConcept.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="How the drug was administered", formalDefinition="How the drug was administered." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/administration-method-codes")
        protected List<CodeableConcept> method;

        /**
         * Average amount of medication per dose.
         */
        @Child(name = "dose", type = {Quantity.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Average amount of medication per dose", formalDefinition="Average amount of medication per dose." )
        protected List<Quantity> dose;

        /**
         * Dose quantity per unit of time.
         */
        @Child(name = "rate", type = {Ratio.class, Quantity.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Dose quantity per unit of time", formalDefinition="Dose quantity per unit of time." )
        protected Type rate;

        private static final long serialVersionUID = -1154319602L;

    /**
     * Constructor
     */
      public ClinicalProfileMedicationDosageComponent() {
        super();
      }

        /**
         * @return {@link #text} (Free text dosage instructions e.g. SIG.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public StringType getTextElement() { 
          if (this.text == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileMedicationDosageComponent.text");
            else if (Configuration.doAutoCreate())
              this.text = new StringType(); // bb
          return this.text;
        }

        public boolean hasTextElement() { 
          return this.text != null && !this.text.isEmpty();
        }

        public boolean hasText() { 
          return this.text != null && !this.text.isEmpty();
        }

        /**
         * @param value {@link #text} (Free text dosage instructions e.g. SIG.). This is the underlying object with id, value and extensions. The accessor "getText" gives direct access to the value
         */
        public ClinicalProfileMedicationDosageComponent setTextElement(StringType value) { 
          this.text = value;
          return this;
        }

        /**
         * @return Free text dosage instructions e.g. SIG.
         */
        public String getText() { 
          return this.text == null ? null : this.text.getValue();
        }

        /**
         * @param value Free text dosage instructions e.g. SIG.
         */
        public ClinicalProfileMedicationDosageComponent setText(String value) { 
          if (Utilities.noString(value))
            this.text = null;
          else {
            if (this.text == null)
              this.text = new StringType();
            this.text.setValue(value);
          }
          return this;
        }

        /**
         * @return {@link #site} (Body site(s) administered to.)
         */
        public List<CodeableConcept> getSite() { 
          if (this.site == null)
            this.site = new ArrayList<CodeableConcept>();
          return this.site;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setSite(List<CodeableConcept> theSite) { 
          this.site = theSite;
          return this;
        }

        public boolean hasSite() { 
          if (this.site == null)
            return false;
          for (CodeableConcept item : this.site)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addSite() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.site == null)
            this.site = new ArrayList<CodeableConcept>();
          this.site.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addSite(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.site == null)
            this.site = new ArrayList<CodeableConcept>();
          this.site.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #site}, creating it if it does not already exist
         */
        public CodeableConcept getSiteFirstRep() { 
          if (getSite().isEmpty()) {
            addSite();
          }
          return getSite().get(0);
        }

        /**
         * @return {@link #route} (Path(s) of substance into body.)
         */
        public List<CodeableConcept> getRoute() { 
          if (this.route == null)
            this.route = new ArrayList<CodeableConcept>();
          return this.route;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setRoute(List<CodeableConcept> theRoute) { 
          this.route = theRoute;
          return this;
        }

        public boolean hasRoute() { 
          if (this.route == null)
            return false;
          for (CodeableConcept item : this.route)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addRoute() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.route == null)
            this.route = new ArrayList<CodeableConcept>();
          this.route.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addRoute(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.route == null)
            this.route = new ArrayList<CodeableConcept>();
          this.route.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #route}, creating it if it does not already exist
         */
        public CodeableConcept getRouteFirstRep() { 
          if (getRoute().isEmpty()) {
            addRoute();
          }
          return getRoute().get(0);
        }

        /**
         * @return {@link #method} (How the drug was administered.)
         */
        public List<CodeableConcept> getMethod() { 
          if (this.method == null)
            this.method = new ArrayList<CodeableConcept>();
          return this.method;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setMethod(List<CodeableConcept> theMethod) { 
          this.method = theMethod;
          return this;
        }

        public boolean hasMethod() { 
          if (this.method == null)
            return false;
          for (CodeableConcept item : this.method)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addMethod() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.method == null)
            this.method = new ArrayList<CodeableConcept>();
          this.method.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addMethod(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.method == null)
            this.method = new ArrayList<CodeableConcept>();
          this.method.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #method}, creating it if it does not already exist
         */
        public CodeableConcept getMethodFirstRep() { 
          if (getMethod().isEmpty()) {
            addMethod();
          }
          return getMethod().get(0);
        }

        /**
         * @return {@link #dose} (Average amount of medication per dose.)
         */
        public List<Quantity> getDose() { 
          if (this.dose == null)
            this.dose = new ArrayList<Quantity>();
          return this.dose;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileMedicationDosageComponent setDose(List<Quantity> theDose) { 
          this.dose = theDose;
          return this;
        }

        public boolean hasDose() { 
          if (this.dose == null)
            return false;
          for (Quantity item : this.dose)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Quantity addDose() { //3
          Quantity t = new Quantity();
          if (this.dose == null)
            this.dose = new ArrayList<Quantity>();
          this.dose.add(t);
          return t;
        }

        public ClinicalProfileMedicationDosageComponent addDose(Quantity t) { //3
          if (t == null)
            return this;
          if (this.dose == null)
            this.dose = new ArrayList<Quantity>();
          this.dose.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #dose}, creating it if it does not already exist
         */
        public Quantity getDoseFirstRep() { 
          if (getDose().isEmpty()) {
            addDose();
          }
          return getDose().get(0);
        }

        /**
         * @return {@link #rate} (Dose quantity per unit of time.)
         */
        public Type getRate() { 
          return this.rate;
        }

        /**
         * @return {@link #rate} (Dose quantity per unit of time.)
         */
        public Ratio getRateRatio() throws FHIRException { 
          if (this.rate == null)
            this.rate = new Ratio();
          if (!(this.rate instanceof Ratio))
            throw new FHIRException("Type mismatch: the type Ratio was expected, but "+this.rate.getClass().getName()+" was encountered");
          return (Ratio) this.rate;
        }

        public boolean hasRateRatio() { 
          return this != null && this.rate instanceof Ratio;
        }

        /**
         * @return {@link #rate} (Dose quantity per unit of time.)
         */
        public Quantity getRateQuantity() throws FHIRException { 
          if (this.rate == null)
            this.rate = new Quantity();
          if (!(this.rate instanceof Quantity))
            throw new FHIRException("Type mismatch: the type Quantity was expected, but "+this.rate.getClass().getName()+" was encountered");
          return (Quantity) this.rate;
        }

        public boolean hasRateQuantity() { 
          return this != null && this.rate instanceof Quantity;
        }

        public boolean hasRate() { 
          return this.rate != null && !this.rate.isEmpty();
        }

        /**
         * @param value {@link #rate} (Dose quantity per unit of time.)
         */
        public ClinicalProfileMedicationDosageComponent setRate(Type value) { 
          if (value != null && !(value instanceof Ratio || value instanceof Quantity))
            throw new Error("Not the right type for ClinicalProfile.medication.dosage.rate[x]: "+value.fhirType());
          this.rate = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("text", "string", "Free text dosage instructions e.g. SIG.", 0, 1, text));
          children.add(new Property("site", "CodeableConcept", "Body site(s) administered to.", 0, java.lang.Integer.MAX_VALUE, site));
          children.add(new Property("route", "CodeableConcept", "Path(s) of substance into body.", 0, java.lang.Integer.MAX_VALUE, route));
          children.add(new Property("method", "CodeableConcept", "How the drug was administered.", 0, java.lang.Integer.MAX_VALUE, method));
          children.add(new Property("dose", "SimpleQuantity", "Average amount of medication per dose.", 0, java.lang.Integer.MAX_VALUE, dose));
          children.add(new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3556653: /*text*/  return new Property("text", "string", "Free text dosage instructions e.g. SIG.", 0, 1, text);
          case 3530567: /*site*/  return new Property("site", "CodeableConcept", "Body site(s) administered to.", 0, java.lang.Integer.MAX_VALUE, site);
          case 108704329: /*route*/  return new Property("route", "CodeableConcept", "Path(s) of substance into body.", 0, java.lang.Integer.MAX_VALUE, route);
          case -1077554975: /*method*/  return new Property("method", "CodeableConcept", "How the drug was administered.", 0, java.lang.Integer.MAX_VALUE, method);
          case 3089437: /*dose*/  return new Property("dose", "SimpleQuantity", "Average amount of medication per dose.", 0, java.lang.Integer.MAX_VALUE, dose);
          case 983460768: /*rate[x]*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          case 3493088: /*rate*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          case 204021515: /*rateRatio*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          case -1085459061: /*rateQuantity*/  return new Property("rate[x]", "Ratio|SimpleQuantity", "Dose quantity per unit of time.", 0, 1, rate);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3556653: /*text*/ return this.text == null ? new Base[0] : new Base[] {this.text}; // StringType
        case 3530567: /*site*/ return this.site == null ? new Base[0] : this.site.toArray(new Base[this.site.size()]); // CodeableConcept
        case 108704329: /*route*/ return this.route == null ? new Base[0] : this.route.toArray(new Base[this.route.size()]); // CodeableConcept
        case -1077554975: /*method*/ return this.method == null ? new Base[0] : this.method.toArray(new Base[this.method.size()]); // CodeableConcept
        case 3089437: /*dose*/ return this.dose == null ? new Base[0] : this.dose.toArray(new Base[this.dose.size()]); // Quantity
        case 3493088: /*rate*/ return this.rate == null ? new Base[0] : new Base[] {this.rate}; // Type
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3556653: // text
          this.text = castToString(value); // StringType
          return value;
        case 3530567: // site
          this.getSite().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 108704329: // route
          this.getRoute().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -1077554975: // method
          this.getMethod().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 3089437: // dose
          this.getDose().add(castToQuantity(value)); // Quantity
          return value;
        case 3493088: // rate
          this.rate = castToType(value); // Type
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("text")) {
          this.text = castToString(value); // StringType
        } else if (name.equals("site")) {
          this.getSite().add(castToCodeableConcept(value));
        } else if (name.equals("route")) {
          this.getRoute().add(castToCodeableConcept(value));
        } else if (name.equals("method")) {
          this.getMethod().add(castToCodeableConcept(value));
        } else if (name.equals("dose")) {
          this.getDose().add(castToQuantity(value));
        } else if (name.equals("rate[x]")) {
          this.rate = castToType(value); // Type
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3556653:  return getTextElement();
        case 3530567:  return addSite(); 
        case 108704329:  return addRoute(); 
        case -1077554975:  return addMethod(); 
        case 3089437:  return addDose(); 
        case 983460768:  return getRate(); 
        case 3493088:  return getRate(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3556653: /*text*/ return new String[] {"string"};
        case 3530567: /*site*/ return new String[] {"CodeableConcept"};
        case 108704329: /*route*/ return new String[] {"CodeableConcept"};
        case -1077554975: /*method*/ return new String[] {"CodeableConcept"};
        case 3089437: /*dose*/ return new String[] {"SimpleQuantity"};
        case 3493088: /*rate*/ return new String[] {"Ratio", "SimpleQuantity"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("text")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.text");
        }
        else if (name.equals("site")) {
          return addSite();
        }
        else if (name.equals("route")) {
          return addRoute();
        }
        else if (name.equals("method")) {
          return addMethod();
        }
        else if (name.equals("dose")) {
          return addDose();
        }
        else if (name.equals("rateRatio")) {
          this.rate = new Ratio();
          return this.rate;
        }
        else if (name.equals("rateQuantity")) {
          this.rate = new Quantity();
          return this.rate;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileMedicationDosageComponent copy() {
        ClinicalProfileMedicationDosageComponent dst = new ClinicalProfileMedicationDosageComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileMedicationDosageComponent dst) {
        super.copyValues(dst);
        dst.text = text == null ? null : text.copy();
        if (site != null) {
          dst.site = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : site)
            dst.site.add(i.copy());
        };
        if (route != null) {
          dst.route = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : route)
            dst.route.add(i.copy());
        };
        if (method != null) {
          dst.method = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : method)
            dst.method.add(i.copy());
        };
        if (dose != null) {
          dst.dose = new ArrayList<Quantity>();
          for (Quantity i : dose)
            dst.dose.add(i.copy());
        };
        dst.rate = rate == null ? null : rate.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationDosageComponent))
          return false;
        ClinicalProfileMedicationDosageComponent o = (ClinicalProfileMedicationDosageComponent) other_;
        return compareDeep(text, o.text, true) && compareDeep(site, o.site, true) && compareDeep(route, o.route, true)
           && compareDeep(method, o.method, true) && compareDeep(dose, o.dose, true) && compareDeep(rate, o.rate, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileMedicationDosageComponent))
          return false;
        ClinicalProfileMedicationDosageComponent o = (ClinicalProfileMedicationDosageComponent) other_;
        return compareValues(text, o.text, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(text, site, route, method
          , dose, rate);
      }

  public String fhirType() {
    return "ClinicalProfile.medication.dosage";

  }

  }

    @Block()
    public static class ClinicalProfileDiagnosisComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Diagnosis code(s).
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="Diagnosis code(s)", formalDefinition="Diagnosis code(s)." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/clinical-findings")
        protected List<CodeableConcept> code;

        /**
         * Number of times listed per patient per hear for each code.
         */
        @Child(name = "count", type = {IntegerType.class}, order=2, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Number of times listed per patient per hear for each code", formalDefinition="Number of times listed per patient per hear for each code." )
        protected IntegerType count;

        /**
         * Frequency of this diagnosis per patient per year.
         */
        @Child(name = "frequencyPerYear", type = {DecimalType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Frequency of this diagnosis per patient per year", formalDefinition="Frequency of this diagnosis per patient per year." )
        protected DecimalType frequencyPerYear;

        /**
         * Fraction of patients in with this diagnosis.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=4, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Fraction of patients in with this diagnosis", formalDefinition="Fraction of patients in with this diagnosis." )
        protected DecimalType fractionOfSubjects;

        /**
         * Correlated labs.
         */
        @Child(name = "correlatedLabs", type = {ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated labs", formalDefinition="Correlated labs." )
        protected ClinicalProfileLabScalarDistributionCorrelatedLabsComponent correlatedLabs;

        /**
         * An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedDiagnoses", type = {ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated diagnosies", formalDefinition="An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent correlatedDiagnoses;

        /**
         * An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedMedications", type = {ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated medications", formalDefinition="An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent correlatedMedications;

        /**
         * An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedProcedures", type = {ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated procedures", formalDefinition="An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent correlatedProcedures;

        /**
         * An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedPhenotypes", type = {ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent.class}, order=9, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated phenotypes", formalDefinition="An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent correlatedPhenotypes;

        private static final long serialVersionUID = 310570747L;

    /**
     * Constructor
     */
      public ClinicalProfileDiagnosisComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileDiagnosisComponent(IntegerType count, DecimalType fractionOfSubjects) {
        super();
        this.count = count;
        this.fractionOfSubjects = fractionOfSubjects;
      }

        /**
         * @return {@link #code} (Diagnosis code(s).)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileDiagnosisComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileDiagnosisComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #count} (Number of times listed per patient per hear for each code.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public IntegerType getCountElement() { 
          if (this.count == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.count");
            else if (Configuration.doAutoCreate())
              this.count = new IntegerType(); // bb
          return this.count;
        }

        public boolean hasCountElement() { 
          return this.count != null && !this.count.isEmpty();
        }

        public boolean hasCount() { 
          return this.count != null && !this.count.isEmpty();
        }

        /**
         * @param value {@link #count} (Number of times listed per patient per hear for each code.). This is the underlying object with id, value and extensions. The accessor "getCount" gives direct access to the value
         */
        public ClinicalProfileDiagnosisComponent setCountElement(IntegerType value) { 
          this.count = value;
          return this;
        }

        /**
         * @return Number of times listed per patient per hear for each code.
         */
        public int getCount() { 
          return this.count == null || this.count.isEmpty() ? 0 : this.count.getValue();
        }

        /**
         * @param value Number of times listed per patient per hear for each code.
         */
        public ClinicalProfileDiagnosisComponent setCount(int value) { 
            if (this.count == null)
              this.count = new IntegerType();
            this.count.setValue(value);
          return this;
        }

        /**
         * @return {@link #frequencyPerYear} (Frequency of this diagnosis per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public DecimalType getFrequencyPerYearElement() { 
          if (this.frequencyPerYear == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.frequencyPerYear");
            else if (Configuration.doAutoCreate())
              this.frequencyPerYear = new DecimalType(); // bb
          return this.frequencyPerYear;
        }

        public boolean hasFrequencyPerYearElement() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        public boolean hasFrequencyPerYear() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        /**
         * @param value {@link #frequencyPerYear} (Frequency of this diagnosis per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public ClinicalProfileDiagnosisComponent setFrequencyPerYearElement(DecimalType value) { 
          this.frequencyPerYear = value;
          return this;
        }

        /**
         * @return Frequency of this diagnosis per patient per year.
         */
        public BigDecimal getFrequencyPerYear() { 
          return this.frequencyPerYear == null ? null : this.frequencyPerYear.getValue();
        }

        /**
         * @param value Frequency of this diagnosis per patient per year.
         */
        public ClinicalProfileDiagnosisComponent setFrequencyPerYear(BigDecimal value) { 
          if (value == null)
            this.frequencyPerYear = null;
          else {
            if (this.frequencyPerYear == null)
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          }
          return this;
        }

        /**
         * @param value Frequency of this diagnosis per patient per year.
         */
        public ClinicalProfileDiagnosisComponent setFrequencyPerYear(long value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @param value Frequency of this diagnosis per patient per year.
         */
        public ClinicalProfileDiagnosisComponent setFrequencyPerYear(double value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionOfSubjects} (Fraction of patients in with this diagnosis.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (Fraction of patients in with this diagnosis.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileDiagnosisComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return Fraction of patients in with this diagnosis.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value Fraction of patients in with this diagnosis.
         */
        public ClinicalProfileDiagnosisComponent setFractionOfSubjects(BigDecimal value) { 
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients in with this diagnosis.
         */
        public ClinicalProfileDiagnosisComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients in with this diagnosis.
         */
        public ClinicalProfileDiagnosisComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent getCorrelatedLabs() { 
          if (this.correlatedLabs == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.correlatedLabs");
            else if (Configuration.doAutoCreate())
              this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent(); // cc
          return this.correlatedLabs;
        }

        public boolean hasCorrelatedLabs() { 
          return this.correlatedLabs != null && !this.correlatedLabs.isEmpty();
        }

        /**
         * @param value {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileDiagnosisComponent setCorrelatedLabs(ClinicalProfileLabScalarDistributionCorrelatedLabsComponent value) { 
          this.correlatedLabs = value;
          return this;
        }

        /**
         * @return {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent getCorrelatedDiagnoses() { 
          if (this.correlatedDiagnoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.correlatedDiagnoses");
            else if (Configuration.doAutoCreate())
              this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent(); // cc
          return this.correlatedDiagnoses;
        }

        public boolean hasCorrelatedDiagnoses() { 
          return this.correlatedDiagnoses != null && !this.correlatedDiagnoses.isEmpty();
        }

        /**
         * @param value {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileDiagnosisComponent setCorrelatedDiagnoses(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent value) { 
          this.correlatedDiagnoses = value;
          return this;
        }

        /**
         * @return {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent getCorrelatedMedications() { 
          if (this.correlatedMedications == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.correlatedMedications");
            else if (Configuration.doAutoCreate())
              this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent(); // cc
          return this.correlatedMedications;
        }

        public boolean hasCorrelatedMedications() { 
          return this.correlatedMedications != null && !this.correlatedMedications.isEmpty();
        }

        /**
         * @param value {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileDiagnosisComponent setCorrelatedMedications(ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent value) { 
          this.correlatedMedications = value;
          return this;
        }

        /**
         * @return {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent getCorrelatedProcedures() { 
          if (this.correlatedProcedures == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.correlatedProcedures");
            else if (Configuration.doAutoCreate())
              this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent(); // cc
          return this.correlatedProcedures;
        }

        public boolean hasCorrelatedProcedures() { 
          return this.correlatedProcedures != null && !this.correlatedProcedures.isEmpty();
        }

        /**
         * @param value {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileDiagnosisComponent setCorrelatedProcedures(ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent value) { 
          this.correlatedProcedures = value;
          return this;
        }

        /**
         * @return {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent getCorrelatedPhenotypes() { 
          if (this.correlatedPhenotypes == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileDiagnosisComponent.correlatedPhenotypes");
            else if (Configuration.doAutoCreate())
              this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent(); // cc
          return this.correlatedPhenotypes;
        }

        public boolean hasCorrelatedPhenotypes() { 
          return this.correlatedPhenotypes != null && !this.correlatedPhenotypes.isEmpty();
        }

        /**
         * @param value {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileDiagnosisComponent setCorrelatedPhenotypes(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent value) { 
          this.correlatedPhenotypes = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("count", "integer", "Number of times listed per patient per hear for each code.", 0, 1, count));
          children.add(new Property("frequencyPerYear", "decimal", "Frequency of this diagnosis per patient per year.", 0, 1, frequencyPerYear));
          children.add(new Property("fractionOfSubjects", "decimal", "Fraction of patients in with this diagnosis.", 0, 1, fractionOfSubjects));
          children.add(new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs));
          children.add(new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses));
          children.add(new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications));
          children.add(new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures));
          children.add(new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "Diagnosis code(s).", 0, java.lang.Integer.MAX_VALUE, code);
          case 94851343: /*count*/  return new Property("count", "integer", "Number of times listed per patient per hear for each code.", 0, 1, count);
          case 751135230: /*frequencyPerYear*/  return new Property("frequencyPerYear", "decimal", "Frequency of this diagnosis per patient per year.", 0, 1, frequencyPerYear);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "Fraction of patients in with this diagnosis.", 0, 1, fractionOfSubjects);
          case 1929642507: /*correlatedLabs*/  return new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs);
          case -1514511344: /*correlatedDiagnoses*/  return new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses);
          case -1167241633: /*correlatedMedications*/  return new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications);
          case -2043850299: /*correlatedProcedures*/  return new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures);
          case 76381968: /*correlatedPhenotypes*/  return new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case 94851343: /*count*/ return this.count == null ? new Base[0] : new Base[] {this.count}; // IntegerType
        case 751135230: /*frequencyPerYear*/ return this.frequencyPerYear == null ? new Base[0] : new Base[] {this.frequencyPerYear}; // DecimalType
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case 1929642507: /*correlatedLabs*/ return this.correlatedLabs == null ? new Base[0] : new Base[] {this.correlatedLabs}; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        case -1514511344: /*correlatedDiagnoses*/ return this.correlatedDiagnoses == null ? new Base[0] : new Base[] {this.correlatedDiagnoses}; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        case -1167241633: /*correlatedMedications*/ return this.correlatedMedications == null ? new Base[0] : new Base[] {this.correlatedMedications}; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        case -2043850299: /*correlatedProcedures*/ return this.correlatedProcedures == null ? new Base[0] : new Base[] {this.correlatedProcedures}; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        case 76381968: /*correlatedPhenotypes*/ return this.correlatedPhenotypes == null ? new Base[0] : new Base[] {this.correlatedPhenotypes}; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 94851343: // count
          this.count = castToInteger(value); // IntegerType
          return value;
        case 751135230: // frequencyPerYear
          this.frequencyPerYear = castToDecimal(value); // DecimalType
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case 1929642507: // correlatedLabs
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
          return value;
        case -1514511344: // correlatedDiagnoses
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
          return value;
        case -1167241633: // correlatedMedications
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
          return value;
        case -2043850299: // correlatedProcedures
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
          return value;
        case 76381968: // correlatedPhenotypes
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("count")) {
          this.count = castToInteger(value); // IntegerType
        } else if (name.equals("frequencyPerYear")) {
          this.frequencyPerYear = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        } else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        } else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        } else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        } else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case 94851343:  return getCountElement();
        case 751135230:  return getFrequencyPerYearElement();
        case -254443680:  return getFractionOfSubjectsElement();
        case 1929642507:  return getCorrelatedLabs(); 
        case -1514511344:  return getCorrelatedDiagnoses(); 
        case -1167241633:  return getCorrelatedMedications(); 
        case -2043850299:  return getCorrelatedProcedures(); 
        case 76381968:  return getCorrelatedPhenotypes(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 94851343: /*count*/ return new String[] {"integer"};
        case 751135230: /*frequencyPerYear*/ return new String[] {"decimal"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case 1929642507: /*correlatedLabs*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedLabs"};
        case -1514511344: /*correlatedDiagnoses*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses"};
        case -1167241633: /*correlatedMedications*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedMedications"};
        case -2043850299: /*correlatedProcedures*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedProcedures"};
        case 76381968: /*correlatedPhenotypes*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("count")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.count");
        }
        else if (name.equals("frequencyPerYear")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.frequencyPerYear");
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
          return this.correlatedLabs;
        }
        else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent();
          return this.correlatedDiagnoses;
        }
        else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent();
          return this.correlatedMedications;
        }
        else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent();
          return this.correlatedProcedures;
        }
        else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent();
          return this.correlatedPhenotypes;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileDiagnosisComponent copy() {
        ClinicalProfileDiagnosisComponent dst = new ClinicalProfileDiagnosisComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileDiagnosisComponent dst) {
        super.copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.count = count == null ? null : count.copy();
        dst.frequencyPerYear = frequencyPerYear == null ? null : frequencyPerYear.copy();
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.correlatedLabs = correlatedLabs == null ? null : correlatedLabs.copy();
        dst.correlatedDiagnoses = correlatedDiagnoses == null ? null : correlatedDiagnoses.copy();
        dst.correlatedMedications = correlatedMedications == null ? null : correlatedMedications.copy();
        dst.correlatedProcedures = correlatedProcedures == null ? null : correlatedProcedures.copy();
        dst.correlatedPhenotypes = correlatedPhenotypes == null ? null : correlatedPhenotypes.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileDiagnosisComponent))
          return false;
        ClinicalProfileDiagnosisComponent o = (ClinicalProfileDiagnosisComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(count, o.count, true) && compareDeep(frequencyPerYear, o.frequencyPerYear, true)
           && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true) && compareDeep(correlatedLabs, o.correlatedLabs, true)
           && compareDeep(correlatedDiagnoses, o.correlatedDiagnoses, true) && compareDeep(correlatedMedications, o.correlatedMedications, true)
           && compareDeep(correlatedProcedures, o.correlatedProcedures, true) && compareDeep(correlatedPhenotypes, o.correlatedPhenotypes, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileDiagnosisComponent))
          return false;
        ClinicalProfileDiagnosisComponent o = (ClinicalProfileDiagnosisComponent) other_;
        return compareValues(count, o.count, true) && compareValues(frequencyPerYear, o.frequencyPerYear, true)
           && compareValues(fractionOfSubjects, o.fractionOfSubjects, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, count, frequencyPerYear
          , fractionOfSubjects, correlatedLabs, correlatedDiagnoses, correlatedMedications, correlatedProcedures
          , correlatedPhenotypes);
      }

  public String fhirType() {
    return "ClinicalProfile.diagnosis";

  }

  }

    @Block()
    public static class ClinicalProfileProcedureComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * ICD-10-PCS or CPT procedure code.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="ICD-10-PCS or CPT procedure code", formalDefinition="ICD-10-PCS or CPT procedure code." )
        protected List<CodeableConcept> code;

        /**
         * Frequency of procedure per patient per year.
         */
        @Child(name = "frequencyPerYear", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Frequency of procedure per patient per year", formalDefinition="Frequency of procedure per patient per year." )
        protected DecimalType frequencyPerYear;

        /**
         * Fraction of patients with this procedure per year.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Fraction of patients with this procedure per year", formalDefinition="Fraction of patients with this procedure per year." )
        protected DecimalType fractionOfSubjects;

        /**
         * Correlated labs.
         */
        @Child(name = "correlatedLabs", type = {ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated labs", formalDefinition="Correlated labs." )
        protected ClinicalProfileLabScalarDistributionCorrelatedLabsComponent correlatedLabs;

        /**
         * An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedDiagnoses", type = {ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated diagnosies", formalDefinition="An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent correlatedDiagnoses;

        /**
         * An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedMedications", type = {ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated medications", formalDefinition="An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent correlatedMedications;

        /**
         * An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedProcedures", type = {ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated procedures", formalDefinition="An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent correlatedProcedures;

        /**
         * An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedPhenotypes", type = {ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated phenotypes", formalDefinition="An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent correlatedPhenotypes;

        private static final long serialVersionUID = 1894344926L;

    /**
     * Constructor
     */
      public ClinicalProfileProcedureComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileProcedureComponent(DecimalType fractionOfSubjects) {
        super();
        this.fractionOfSubjects = fractionOfSubjects;
      }

        /**
         * @return {@link #code} (ICD-10-PCS or CPT procedure code.)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileProcedureComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileProcedureComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #frequencyPerYear} (Frequency of procedure per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public DecimalType getFrequencyPerYearElement() { 
          if (this.frequencyPerYear == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.frequencyPerYear");
            else if (Configuration.doAutoCreate())
              this.frequencyPerYear = new DecimalType(); // bb
          return this.frequencyPerYear;
        }

        public boolean hasFrequencyPerYearElement() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        public boolean hasFrequencyPerYear() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        /**
         * @param value {@link #frequencyPerYear} (Frequency of procedure per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public ClinicalProfileProcedureComponent setFrequencyPerYearElement(DecimalType value) { 
          this.frequencyPerYear = value;
          return this;
        }

        /**
         * @return Frequency of procedure per patient per year.
         */
        public BigDecimal getFrequencyPerYear() { 
          return this.frequencyPerYear == null ? null : this.frequencyPerYear.getValue();
        }

        /**
         * @param value Frequency of procedure per patient per year.
         */
        public ClinicalProfileProcedureComponent setFrequencyPerYear(BigDecimal value) { 
          if (value == null)
            this.frequencyPerYear = null;
          else {
            if (this.frequencyPerYear == null)
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          }
          return this;
        }

        /**
         * @param value Frequency of procedure per patient per year.
         */
        public ClinicalProfileProcedureComponent setFrequencyPerYear(long value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @param value Frequency of procedure per patient per year.
         */
        public ClinicalProfileProcedureComponent setFrequencyPerYear(double value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionOfSubjects} (Fraction of patients with this procedure per year.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (Fraction of patients with this procedure per year.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return Fraction of patients with this procedure per year.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjects(BigDecimal value) { 
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileProcedureComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent getCorrelatedLabs() { 
          if (this.correlatedLabs == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.correlatedLabs");
            else if (Configuration.doAutoCreate())
              this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent(); // cc
          return this.correlatedLabs;
        }

        public boolean hasCorrelatedLabs() { 
          return this.correlatedLabs != null && !this.correlatedLabs.isEmpty();
        }

        /**
         * @param value {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileProcedureComponent setCorrelatedLabs(ClinicalProfileLabScalarDistributionCorrelatedLabsComponent value) { 
          this.correlatedLabs = value;
          return this;
        }

        /**
         * @return {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent getCorrelatedDiagnoses() { 
          if (this.correlatedDiagnoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.correlatedDiagnoses");
            else if (Configuration.doAutoCreate())
              this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent(); // cc
          return this.correlatedDiagnoses;
        }

        public boolean hasCorrelatedDiagnoses() { 
          return this.correlatedDiagnoses != null && !this.correlatedDiagnoses.isEmpty();
        }

        /**
         * @param value {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileProcedureComponent setCorrelatedDiagnoses(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent value) { 
          this.correlatedDiagnoses = value;
          return this;
        }

        /**
         * @return {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent getCorrelatedMedications() { 
          if (this.correlatedMedications == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.correlatedMedications");
            else if (Configuration.doAutoCreate())
              this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent(); // cc
          return this.correlatedMedications;
        }

        public boolean hasCorrelatedMedications() { 
          return this.correlatedMedications != null && !this.correlatedMedications.isEmpty();
        }

        /**
         * @param value {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileProcedureComponent setCorrelatedMedications(ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent value) { 
          this.correlatedMedications = value;
          return this;
        }

        /**
         * @return {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent getCorrelatedProcedures() { 
          if (this.correlatedProcedures == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.correlatedProcedures");
            else if (Configuration.doAutoCreate())
              this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent(); // cc
          return this.correlatedProcedures;
        }

        public boolean hasCorrelatedProcedures() { 
          return this.correlatedProcedures != null && !this.correlatedProcedures.isEmpty();
        }

        /**
         * @param value {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileProcedureComponent setCorrelatedProcedures(ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent value) { 
          this.correlatedProcedures = value;
          return this;
        }

        /**
         * @return {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent getCorrelatedPhenotypes() { 
          if (this.correlatedPhenotypes == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileProcedureComponent.correlatedPhenotypes");
            else if (Configuration.doAutoCreate())
              this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent(); // cc
          return this.correlatedPhenotypes;
        }

        public boolean hasCorrelatedPhenotypes() { 
          return this.correlatedPhenotypes != null && !this.correlatedPhenotypes.isEmpty();
        }

        /**
         * @param value {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileProcedureComponent setCorrelatedPhenotypes(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent value) { 
          this.correlatedPhenotypes = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "ICD-10-PCS or CPT procedure code.", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("frequencyPerYear", "decimal", "Frequency of procedure per patient per year.", 0, 1, frequencyPerYear));
          children.add(new Property("fractionOfSubjects", "decimal", "Fraction of patients with this procedure per year.", 0, 1, fractionOfSubjects));
          children.add(new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs));
          children.add(new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses));
          children.add(new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications));
          children.add(new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures));
          children.add(new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "ICD-10-PCS or CPT procedure code.", 0, java.lang.Integer.MAX_VALUE, code);
          case 751135230: /*frequencyPerYear*/  return new Property("frequencyPerYear", "decimal", "Frequency of procedure per patient per year.", 0, 1, frequencyPerYear);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "Fraction of patients with this procedure per year.", 0, 1, fractionOfSubjects);
          case 1929642507: /*correlatedLabs*/  return new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs);
          case -1514511344: /*correlatedDiagnoses*/  return new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses);
          case -1167241633: /*correlatedMedications*/  return new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications);
          case -2043850299: /*correlatedProcedures*/  return new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures);
          case 76381968: /*correlatedPhenotypes*/  return new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case 751135230: /*frequencyPerYear*/ return this.frequencyPerYear == null ? new Base[0] : new Base[] {this.frequencyPerYear}; // DecimalType
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case 1929642507: /*correlatedLabs*/ return this.correlatedLabs == null ? new Base[0] : new Base[] {this.correlatedLabs}; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        case -1514511344: /*correlatedDiagnoses*/ return this.correlatedDiagnoses == null ? new Base[0] : new Base[] {this.correlatedDiagnoses}; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        case -1167241633: /*correlatedMedications*/ return this.correlatedMedications == null ? new Base[0] : new Base[] {this.correlatedMedications}; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        case -2043850299: /*correlatedProcedures*/ return this.correlatedProcedures == null ? new Base[0] : new Base[] {this.correlatedProcedures}; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        case 76381968: /*correlatedPhenotypes*/ return this.correlatedPhenotypes == null ? new Base[0] : new Base[] {this.correlatedPhenotypes}; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 751135230: // frequencyPerYear
          this.frequencyPerYear = castToDecimal(value); // DecimalType
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case 1929642507: // correlatedLabs
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
          return value;
        case -1514511344: // correlatedDiagnoses
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
          return value;
        case -1167241633: // correlatedMedications
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
          return value;
        case -2043850299: // correlatedProcedures
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
          return value;
        case 76381968: // correlatedPhenotypes
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("frequencyPerYear")) {
          this.frequencyPerYear = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        } else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        } else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        } else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        } else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case 751135230:  return getFrequencyPerYearElement();
        case -254443680:  return getFractionOfSubjectsElement();
        case 1929642507:  return getCorrelatedLabs(); 
        case -1514511344:  return getCorrelatedDiagnoses(); 
        case -1167241633:  return getCorrelatedMedications(); 
        case -2043850299:  return getCorrelatedProcedures(); 
        case 76381968:  return getCorrelatedPhenotypes(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 751135230: /*frequencyPerYear*/ return new String[] {"decimal"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case 1929642507: /*correlatedLabs*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedLabs"};
        case -1514511344: /*correlatedDiagnoses*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses"};
        case -1167241633: /*correlatedMedications*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedMedications"};
        case -2043850299: /*correlatedProcedures*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedProcedures"};
        case 76381968: /*correlatedPhenotypes*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("frequencyPerYear")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.frequencyPerYear");
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
          return this.correlatedLabs;
        }
        else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent();
          return this.correlatedDiagnoses;
        }
        else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent();
          return this.correlatedMedications;
        }
        else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent();
          return this.correlatedProcedures;
        }
        else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent();
          return this.correlatedPhenotypes;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileProcedureComponent copy() {
        ClinicalProfileProcedureComponent dst = new ClinicalProfileProcedureComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileProcedureComponent dst) {
        super.copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.frequencyPerYear = frequencyPerYear == null ? null : frequencyPerYear.copy();
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.correlatedLabs = correlatedLabs == null ? null : correlatedLabs.copy();
        dst.correlatedDiagnoses = correlatedDiagnoses == null ? null : correlatedDiagnoses.copy();
        dst.correlatedMedications = correlatedMedications == null ? null : correlatedMedications.copy();
        dst.correlatedProcedures = correlatedProcedures == null ? null : correlatedProcedures.copy();
        dst.correlatedPhenotypes = correlatedPhenotypes == null ? null : correlatedPhenotypes.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureComponent))
          return false;
        ClinicalProfileProcedureComponent o = (ClinicalProfileProcedureComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(frequencyPerYear, o.frequencyPerYear, true)
           && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true) && compareDeep(correlatedLabs, o.correlatedLabs, true)
           && compareDeep(correlatedDiagnoses, o.correlatedDiagnoses, true) && compareDeep(correlatedMedications, o.correlatedMedications, true)
           && compareDeep(correlatedProcedures, o.correlatedProcedures, true) && compareDeep(correlatedPhenotypes, o.correlatedPhenotypes, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileProcedureComponent))
          return false;
        ClinicalProfileProcedureComponent o = (ClinicalProfileProcedureComponent) other_;
        return compareValues(frequencyPerYear, o.frequencyPerYear, true) && compareValues(fractionOfSubjects, o.fractionOfSubjects, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, frequencyPerYear, fractionOfSubjects
          , correlatedLabs, correlatedDiagnoses, correlatedMedications, correlatedProcedures, correlatedPhenotypes
          );
      }

  public String fhirType() {
    return "ClinicalProfile.procedure";

  }

  }

    @Block()
    public static class ClinicalProfileHpoComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * HPO code.
         */
        @Child(name = "code", type = {CodeableConcept.class}, order=1, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
        @Description(shortDefinition="HPO code", formalDefinition="HPO code." )
        protected List<CodeableConcept> code;

        /**
         * Frequency of this code per patient per year.
         */
        @Child(name = "frequencyPerYear", type = {DecimalType.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Frequency of this code per patient per year", formalDefinition="Frequency of this code per patient per year." )
        protected DecimalType frequencyPerYear;

        /**
         * Fraction of patients with this procedure per year.
         */
        @Child(name = "fractionOfSubjects", type = {DecimalType.class}, order=3, min=1, max=1, modifier=false, summary=true)
        @Description(shortDefinition="Fraction of patients with this procedure per year", formalDefinition="Fraction of patients with this procedure per year." )
        protected DecimalType fractionOfSubjects;

        /**
         * Correlated labs.
         */
        @Child(name = "correlatedLabs", type = {ClinicalProfileLabScalarDistributionCorrelatedLabsComponent.class}, order=4, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated labs", formalDefinition="Correlated labs." )
        protected ClinicalProfileLabScalarDistributionCorrelatedLabsComponent correlatedLabs;

        /**
         * An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedDiagnoses", type = {ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated diagnosies", formalDefinition="An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent correlatedDiagnoses;

        /**
         * An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedMedications", type = {ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated medications", formalDefinition="An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent correlatedMedications;

        /**
         * An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedProcedures", type = {ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated procedures", formalDefinition="An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent correlatedProcedures;

        /**
         * An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.
         */
        @Child(name = "correlatedPhenotypes", type = {ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Correlated phenotypes", formalDefinition="An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient." )
        protected ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent correlatedPhenotypes;

        private static final long serialVersionUID = 1894344926L;

    /**
     * Constructor
     */
      public ClinicalProfileHpoComponent() {
        super();
      }

    /**
     * Constructor
     */
      public ClinicalProfileHpoComponent(DecimalType fractionOfSubjects) {
        super();
        this.fractionOfSubjects = fractionOfSubjects;
      }

        /**
         * @return {@link #code} (HPO code.)
         */
        public List<CodeableConcept> getCode() { 
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          return this.code;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public ClinicalProfileHpoComponent setCode(List<CodeableConcept> theCode) { 
          this.code = theCode;
          return this;
        }

        public boolean hasCode() { 
          if (this.code == null)
            return false;
          for (CodeableConcept item : this.code)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addCode() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return t;
        }

        public ClinicalProfileHpoComponent addCode(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.code == null)
            this.code = new ArrayList<CodeableConcept>();
          this.code.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #code}, creating it if it does not already exist
         */
        public CodeableConcept getCodeFirstRep() { 
          if (getCode().isEmpty()) {
            addCode();
          }
          return getCode().get(0);
        }

        /**
         * @return {@link #frequencyPerYear} (Frequency of this code per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public DecimalType getFrequencyPerYearElement() { 
          if (this.frequencyPerYear == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileHpoComponent.frequencyPerYear");
            else if (Configuration.doAutoCreate())
              this.frequencyPerYear = new DecimalType(); // bb
          return this.frequencyPerYear;
        }

        public boolean hasFrequencyPerYearElement() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        public boolean hasFrequencyPerYear() { 
          return this.frequencyPerYear != null && !this.frequencyPerYear.isEmpty();
        }

        /**
         * @param value {@link #frequencyPerYear} (Frequency of this code per patient per year.). This is the underlying object with id, value and extensions. The accessor "getFrequencyPerYear" gives direct access to the value
         */
        public ClinicalProfileHpoComponent setFrequencyPerYearElement(DecimalType value) { 
          this.frequencyPerYear = value;
          return this;
        }

        /**
         * @return Frequency of this code per patient per year.
         */
        public BigDecimal getFrequencyPerYear() { 
          return this.frequencyPerYear == null ? null : this.frequencyPerYear.getValue();
        }

        /**
         * @param value Frequency of this code per patient per year.
         */
        public ClinicalProfileHpoComponent setFrequencyPerYear(BigDecimal value) { 
          if (value == null)
            this.frequencyPerYear = null;
          else {
            if (this.frequencyPerYear == null)
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          }
          return this;
        }

        /**
         * @param value Frequency of this code per patient per year.
         */
        public ClinicalProfileHpoComponent setFrequencyPerYear(long value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @param value Frequency of this code per patient per year.
         */
        public ClinicalProfileHpoComponent setFrequencyPerYear(double value) { 
              this.frequencyPerYear = new DecimalType();
            this.frequencyPerYear.setValue(value);
          return this;
        }

        /**
         * @return {@link #fractionOfSubjects} (Fraction of patients with this procedure per year.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public DecimalType getFractionOfSubjectsElement() { 
          if (this.fractionOfSubjects == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileHpoComponent.fractionOfSubjects");
            else if (Configuration.doAutoCreate())
              this.fractionOfSubjects = new DecimalType(); // bb
          return this.fractionOfSubjects;
        }

        public boolean hasFractionOfSubjectsElement() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        public boolean hasFractionOfSubjects() { 
          return this.fractionOfSubjects != null && !this.fractionOfSubjects.isEmpty();
        }

        /**
         * @param value {@link #fractionOfSubjects} (Fraction of patients with this procedure per year.). This is the underlying object with id, value and extensions. The accessor "getFractionOfSubjects" gives direct access to the value
         */
        public ClinicalProfileHpoComponent setFractionOfSubjectsElement(DecimalType value) { 
          this.fractionOfSubjects = value;
          return this;
        }

        /**
         * @return Fraction of patients with this procedure per year.
         */
        public BigDecimal getFractionOfSubjects() { 
          return this.fractionOfSubjects == null ? null : this.fractionOfSubjects.getValue();
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileHpoComponent setFractionOfSubjects(BigDecimal value) { 
            if (this.fractionOfSubjects == null)
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileHpoComponent setFractionOfSubjects(long value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @param value Fraction of patients with this procedure per year.
         */
        public ClinicalProfileHpoComponent setFractionOfSubjects(double value) { 
              this.fractionOfSubjects = new DecimalType();
            this.fractionOfSubjects.setValue(value);
          return this;
        }

        /**
         * @return {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedLabsComponent getCorrelatedLabs() { 
          if (this.correlatedLabs == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileHpoComponent.correlatedLabs");
            else if (Configuration.doAutoCreate())
              this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent(); // cc
          return this.correlatedLabs;
        }

        public boolean hasCorrelatedLabs() { 
          return this.correlatedLabs != null && !this.correlatedLabs.isEmpty();
        }

        /**
         * @param value {@link #correlatedLabs} (Correlated labs.)
         */
        public ClinicalProfileHpoComponent setCorrelatedLabs(ClinicalProfileLabScalarDistributionCorrelatedLabsComponent value) { 
          this.correlatedLabs = value;
          return this;
        }

        /**
         * @return {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent getCorrelatedDiagnoses() { 
          if (this.correlatedDiagnoses == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileHpoComponent.correlatedDiagnoses");
            else if (Configuration.doAutoCreate())
              this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent(); // cc
          return this.correlatedDiagnoses;
        }

        public boolean hasCorrelatedDiagnoses() { 
          return this.correlatedDiagnoses != null && !this.correlatedDiagnoses.isEmpty();
        }

        /**
         * @param value {@link #correlatedDiagnoses} (An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top "n" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileHpoComponent setCorrelatedDiagnoses(ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent value) { 
          this.correlatedDiagnoses = value;
          return this;
        }

        /**
         * @return {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent getCorrelatedMedications() { 
          if (this.correlatedMedications == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileHpoComponent.correlatedMedications");
            else if (Configuration.doAutoCreate())
              this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent(); // cc
          return this.correlatedMedications;
        }

        public boolean hasCorrelatedMedications() { 
          return this.correlatedMedications != null && !this.correlatedMedications.isEmpty();
        }

        /**
         * @param value {@link #correlatedMedications} (An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top "n" medications and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileHpoComponent setCorrelatedMedications(ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent value) { 
          this.correlatedMedications = value;
          return this;
        }

        /**
         * @return {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent getCorrelatedProcedures() { 
          if (this.correlatedProcedures == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileHpoComponent.correlatedProcedures");
            else if (Configuration.doAutoCreate())
              this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent(); // cc
          return this.correlatedProcedures;
        }

        public boolean hasCorrelatedProcedures() { 
          return this.correlatedProcedures != null && !this.correlatedProcedures.isEmpty();
        }

        /**
         * @param value {@link #correlatedProcedures} (An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top "n" procedures and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileHpoComponent setCorrelatedProcedures(ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent value) { 
          this.correlatedProcedures = value;
          return this;
        }

        /**
         * @return {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent getCorrelatedPhenotypes() { 
          if (this.correlatedPhenotypes == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create ClinicalProfileHpoComponent.correlatedPhenotypes");
            else if (Configuration.doAutoCreate())
              this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent(); // cc
          return this.correlatedPhenotypes;
        }

        public boolean hasCorrelatedPhenotypes() { 
          return this.correlatedPhenotypes != null && !this.correlatedPhenotypes.isEmpty();
        }

        /**
         * @param value {@link #correlatedPhenotypes} (An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top "n" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.)
         */
        public ClinicalProfileHpoComponent setCorrelatedPhenotypes(ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent value) { 
          this.correlatedPhenotypes = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("code", "CodeableConcept", "HPO code.", 0, java.lang.Integer.MAX_VALUE, code));
          children.add(new Property("frequencyPerYear", "decimal", "Frequency of this code per patient per year.", 0, 1, frequencyPerYear));
          children.add(new Property("fractionOfSubjects", "decimal", "Fraction of patients with this procedure per year.", 0, 1, fractionOfSubjects));
          children.add(new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs));
          children.add(new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses));
          children.add(new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications));
          children.add(new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures));
          children.add(new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3059181: /*code*/  return new Property("code", "CodeableConcept", "HPO code.", 0, java.lang.Integer.MAX_VALUE, code);
          case 751135230: /*frequencyPerYear*/  return new Property("frequencyPerYear", "decimal", "Frequency of this code per patient per year.", 0, 1, frequencyPerYear);
          case -254443680: /*fractionOfSubjects*/  return new Property("fractionOfSubjects", "decimal", "Fraction of patients with this procedure per year.", 0, 1, fractionOfSubjects);
          case 1929642507: /*correlatedLabs*/  return new Property("correlatedLabs", "@ClinicalProfile.lab.scalarDistribution.correlatedLabs", "Correlated labs.", 0, 1, correlatedLabs);
          case -1514511344: /*correlatedDiagnoses*/  return new Property("correlatedDiagnoses", "@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses", "An ordered list of  the diagnoses  that are most closely correlated.  This list can be limited by the top \"n\" diagnoses and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedDiagnoses);
          case -1167241633: /*correlatedMedications*/  return new Property("correlatedMedications", "@ClinicalProfile.lab.scalarDistribution.correlatedMedications", "An ordered list of  the medications  that are most closely correlated.  This list can be limited by the top \"n\" medications and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedMedications);
          case -2043850299: /*correlatedProcedures*/  return new Property("correlatedProcedures", "@ClinicalProfile.lab.scalarDistribution.correlatedProcedures", "An ordered list of  the procedures  that are most closely correlated.  This list can be limited by the top \"n\" procedures and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedProcedures);
          case 76381968: /*correlatedPhenotypes*/  return new Property("correlatedPhenotypes", "@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes", "An ordered list of  the phenotypes  that are most closely correlated.  This list can be limited by the top \"n\" phenotypes and/or a cutoff on the absolute value of the correlation coefficient.", 0, 1, correlatedPhenotypes);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return this.code == null ? new Base[0] : this.code.toArray(new Base[this.code.size()]); // CodeableConcept
        case 751135230: /*frequencyPerYear*/ return this.frequencyPerYear == null ? new Base[0] : new Base[] {this.frequencyPerYear}; // DecimalType
        case -254443680: /*fractionOfSubjects*/ return this.fractionOfSubjects == null ? new Base[0] : new Base[] {this.fractionOfSubjects}; // DecimalType
        case 1929642507: /*correlatedLabs*/ return this.correlatedLabs == null ? new Base[0] : new Base[] {this.correlatedLabs}; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        case -1514511344: /*correlatedDiagnoses*/ return this.correlatedDiagnoses == null ? new Base[0] : new Base[] {this.correlatedDiagnoses}; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        case -1167241633: /*correlatedMedications*/ return this.correlatedMedications == null ? new Base[0] : new Base[] {this.correlatedMedications}; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        case -2043850299: /*correlatedProcedures*/ return this.correlatedProcedures == null ? new Base[0] : new Base[] {this.correlatedProcedures}; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        case 76381968: /*correlatedPhenotypes*/ return this.correlatedPhenotypes == null ? new Base[0] : new Base[] {this.correlatedPhenotypes}; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3059181: // code
          this.getCode().add(castToCodeableConcept(value)); // CodeableConcept
          return value;
        case 751135230: // frequencyPerYear
          this.frequencyPerYear = castToDecimal(value); // DecimalType
          return value;
        case -254443680: // fractionOfSubjects
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
          return value;
        case 1929642507: // correlatedLabs
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
          return value;
        case -1514511344: // correlatedDiagnoses
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
          return value;
        case -1167241633: // correlatedMedications
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
          return value;
        case -2043850299: // correlatedProcedures
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
          return value;
        case 76381968: // correlatedPhenotypes
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("code")) {
          this.getCode().add(castToCodeableConcept(value));
        } else if (name.equals("frequencyPerYear")) {
          this.frequencyPerYear = castToDecimal(value); // DecimalType
        } else if (name.equals("fractionOfSubjects")) {
          this.fractionOfSubjects = castToDecimal(value); // DecimalType
        } else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = (ClinicalProfileLabScalarDistributionCorrelatedLabsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedLabsComponent
        } else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = (ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent
        } else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = (ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent
        } else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = (ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent
        } else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = (ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent) value; // ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181:  return addCode(); 
        case 751135230:  return getFrequencyPerYearElement();
        case -254443680:  return getFractionOfSubjectsElement();
        case 1929642507:  return getCorrelatedLabs(); 
        case -1514511344:  return getCorrelatedDiagnoses(); 
        case -1167241633:  return getCorrelatedMedications(); 
        case -2043850299:  return getCorrelatedProcedures(); 
        case 76381968:  return getCorrelatedPhenotypes(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3059181: /*code*/ return new String[] {"CodeableConcept"};
        case 751135230: /*frequencyPerYear*/ return new String[] {"decimal"};
        case -254443680: /*fractionOfSubjects*/ return new String[] {"decimal"};
        case 1929642507: /*correlatedLabs*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedLabs"};
        case -1514511344: /*correlatedDiagnoses*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedDiagnoses"};
        case -1167241633: /*correlatedMedications*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedMedications"};
        case -2043850299: /*correlatedProcedures*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedProcedures"};
        case 76381968: /*correlatedPhenotypes*/ return new String[] {"@ClinicalProfile.lab.scalarDistribution.correlatedPhenotypes"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("code")) {
          return addCode();
        }
        else if (name.equals("frequencyPerYear")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.frequencyPerYear");
        }
        else if (name.equals("fractionOfSubjects")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.fractionOfSubjects");
        }
        else if (name.equals("correlatedLabs")) {
          this.correlatedLabs = new ClinicalProfileLabScalarDistributionCorrelatedLabsComponent();
          return this.correlatedLabs;
        }
        else if (name.equals("correlatedDiagnoses")) {
          this.correlatedDiagnoses = new ClinicalProfileLabScalarDistributionCorrelatedDiagnosesComponent();
          return this.correlatedDiagnoses;
        }
        else if (name.equals("correlatedMedications")) {
          this.correlatedMedications = new ClinicalProfileLabScalarDistributionCorrelatedMedicationsComponent();
          return this.correlatedMedications;
        }
        else if (name.equals("correlatedProcedures")) {
          this.correlatedProcedures = new ClinicalProfileLabScalarDistributionCorrelatedProceduresComponent();
          return this.correlatedProcedures;
        }
        else if (name.equals("correlatedPhenotypes")) {
          this.correlatedPhenotypes = new ClinicalProfileLabScalarDistributionCorrelatedPhenotypesComponent();
          return this.correlatedPhenotypes;
        }
        else
          return super.addChild(name);
      }

      public ClinicalProfileHpoComponent copy() {
        ClinicalProfileHpoComponent dst = new ClinicalProfileHpoComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfileHpoComponent dst) {
        super.copyValues(dst);
        if (code != null) {
          dst.code = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : code)
            dst.code.add(i.copy());
        };
        dst.frequencyPerYear = frequencyPerYear == null ? null : frequencyPerYear.copy();
        dst.fractionOfSubjects = fractionOfSubjects == null ? null : fractionOfSubjects.copy();
        dst.correlatedLabs = correlatedLabs == null ? null : correlatedLabs.copy();
        dst.correlatedDiagnoses = correlatedDiagnoses == null ? null : correlatedDiagnoses.copy();
        dst.correlatedMedications = correlatedMedications == null ? null : correlatedMedications.copy();
        dst.correlatedProcedures = correlatedProcedures == null ? null : correlatedProcedures.copy();
        dst.correlatedPhenotypes = correlatedPhenotypes == null ? null : correlatedPhenotypes.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileHpoComponent))
          return false;
        ClinicalProfileHpoComponent o = (ClinicalProfileHpoComponent) other_;
        return compareDeep(code, o.code, true) && compareDeep(frequencyPerYear, o.frequencyPerYear, true)
           && compareDeep(fractionOfSubjects, o.fractionOfSubjects, true) && compareDeep(correlatedLabs, o.correlatedLabs, true)
           && compareDeep(correlatedDiagnoses, o.correlatedDiagnoses, true) && compareDeep(correlatedMedications, o.correlatedMedications, true)
           && compareDeep(correlatedProcedures, o.correlatedProcedures, true) && compareDeep(correlatedPhenotypes, o.correlatedPhenotypes, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfileHpoComponent))
          return false;
        ClinicalProfileHpoComponent o = (ClinicalProfileHpoComponent) other_;
        return compareValues(frequencyPerYear, o.frequencyPerYear, true) && compareValues(fractionOfSubjects, o.fractionOfSubjects, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(code, frequencyPerYear, fractionOfSubjects
          , correlatedLabs, correlatedDiagnoses, correlatedMedications, correlatedProcedures, correlatedPhenotypes
          );
      }

  public String fhirType() {
    return "ClinicalProfile.hpo";

  }

  }

    /**
     * A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="Additional identifier for the ClinicalProfile", formalDefinition="A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance." )
    protected List<Identifier> identifier;

    /**
     * The ClinicalProfile status.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="complete | draft | error", formalDefinition="The ClinicalProfile status." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/clinical-profile-status")
    protected Enumeration<ClinicalProfileStatus> status;

    /**
     * The base population against which this profile was generated.
     */
    @Child(name = "population", type = {Group.class}, order=2, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The base population against which this profile was generated", formalDefinition="The base population against which this profile was generated." )
    protected Reference population;

    /**
     * The actual object that is the target of the reference (The base population against which this profile was generated.)
     */
    protected Group populationTarget;

    /**
     * The cohort within the population that this profile represents.
     */
    @Child(name = "cohort", type = {Group.class}, order=3, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="The cohort within the population that this profile represents", formalDefinition="The cohort within the population that this profile represents." )
    protected Reference cohort;

    /**
     * The actual object that is the target of the reference (The cohort within the population that this profile represents.)
     */
    protected Group cohortTarget;

    /**
     * When the profile was generated.
     */
    @Child(name = "date", type = {DateTimeType.class}, order=4, min=0, max=1, modifier=false, summary=true)
    @Description(shortDefinition="When the profile was generated", formalDefinition="When the profile was generated." )
    protected DateTimeType date;

    /**
     * Identifier(s) from where the profile was acquired.
     */
    @Child(name = "source", type = {Identifier.class}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Identifier(s) from where the profile was acquired", formalDefinition="Identifier(s) from where the profile was acquired." )
    protected List<Identifier> source;

    /**
     * Who is reporting the data.
     */
    @Child(name = "reporter", type = {Organization.class, Practitioner.class, PractitionerRole.class, Location.class}, order=6, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Who is reporting the data", formalDefinition="Who is reporting the data." )
    protected Reference reporter;

    /**
     * The actual object that is the target of the reference (Who is reporting the data.)
     */
    protected Resource reporterTarget;

    /**
     * Laboratory profile entry.
     */
    @Child(name = "lab", type = {}, order=7, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Laboratory profile entry", formalDefinition="Laboratory profile entry." )
    protected List<ClinicalProfileLabComponent> lab;

    /**
     * Medication profile entry.
     */
    @Child(name = "medication", type = {}, order=8, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Medication profile entry", formalDefinition="Medication profile entry." )
    protected List<ClinicalProfileMedicationComponent> medication;

    /**
     * Diagnosis profile entry.
     */
    @Child(name = "diagnosis", type = {}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Diagnosis profile entry", formalDefinition="Diagnosis profile entry." )
    protected List<ClinicalProfileDiagnosisComponent> diagnosis;

    /**
     * Procedure profile entry.
     */
    @Child(name = "procedure", type = {}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Procedure profile entry", formalDefinition="Procedure profile entry." )
    protected List<ClinicalProfileProcedureComponent> procedure;

    /**
     * Phenotypic description.
     */
    @Child(name = "hpo", type = {}, order=11, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="HPO Profile Entry", formalDefinition="Phenotypic description." )
    protected List<ClinicalProfileHpoComponent> hpo;

    private static final long serialVersionUID = 2068390069L;

  /**
   * Constructor
   */
    public ClinicalProfile() {
      super();
    }

  /**
   * Constructor
   */
    public ClinicalProfile(Enumeration<ClinicalProfileStatus> status, Reference population, Reference cohort, Reference reporter) {
      super();
      this.status = status;
      this.population = population;
      this.cohort = cohort;
      this.reporter = reporter;
    }

    /**
     * @return {@link #identifier} (A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setIdentifier(List<Identifier> theIdentifier) { 
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

    public ClinicalProfile addIdentifier(Identifier t) { //3
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
     * @return {@link #status} (The ClinicalProfile status.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<ClinicalProfileStatus> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<ClinicalProfileStatus>(new ClinicalProfileStatusEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The ClinicalProfile status.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public ClinicalProfile setStatusElement(Enumeration<ClinicalProfileStatus> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The ClinicalProfile status.
     */
    public ClinicalProfileStatus getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The ClinicalProfile status.
     */
    public ClinicalProfile setStatus(ClinicalProfileStatus value) { 
        if (this.status == null)
          this.status = new Enumeration<ClinicalProfileStatus>(new ClinicalProfileStatusEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #population} (The base population against which this profile was generated.)
     */
    public Reference getPopulation() { 
      if (this.population == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.population");
        else if (Configuration.doAutoCreate())
          this.population = new Reference(); // cc
      return this.population;
    }

    public boolean hasPopulation() { 
      return this.population != null && !this.population.isEmpty();
    }

    /**
     * @param value {@link #population} (The base population against which this profile was generated.)
     */
    public ClinicalProfile setPopulation(Reference value) { 
      this.population = value;
      return this;
    }

    /**
     * @return {@link #population} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The base population against which this profile was generated.)
     */
    public Group getPopulationTarget() { 
      if (this.populationTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.population");
        else if (Configuration.doAutoCreate())
          this.populationTarget = new Group(); // aa
      return this.populationTarget;
    }

    /**
     * @param value {@link #population} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The base population against which this profile was generated.)
     */
    public ClinicalProfile setPopulationTarget(Group value) { 
      this.populationTarget = value;
      return this;
    }

    /**
     * @return {@link #cohort} (The cohort within the population that this profile represents.)
     */
    public Reference getCohort() { 
      if (this.cohort == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.cohort");
        else if (Configuration.doAutoCreate())
          this.cohort = new Reference(); // cc
      return this.cohort;
    }

    public boolean hasCohort() { 
      return this.cohort != null && !this.cohort.isEmpty();
    }

    /**
     * @param value {@link #cohort} (The cohort within the population that this profile represents.)
     */
    public ClinicalProfile setCohort(Reference value) { 
      this.cohort = value;
      return this;
    }

    /**
     * @return {@link #cohort} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (The cohort within the population that this profile represents.)
     */
    public Group getCohortTarget() { 
      if (this.cohortTarget == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.cohort");
        else if (Configuration.doAutoCreate())
          this.cohortTarget = new Group(); // aa
      return this.cohortTarget;
    }

    /**
     * @param value {@link #cohort} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (The cohort within the population that this profile represents.)
     */
    public ClinicalProfile setCohortTarget(Group value) { 
      this.cohortTarget = value;
      return this;
    }

    /**
     * @return {@link #date} (When the profile was generated.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public DateTimeType getDateElement() { 
      if (this.date == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.date");
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
     * @param value {@link #date} (When the profile was generated.). This is the underlying object with id, value and extensions. The accessor "getDate" gives direct access to the value
     */
    public ClinicalProfile setDateElement(DateTimeType value) { 
      this.date = value;
      return this;
    }

    /**
     * @return When the profile was generated.
     */
    public Date getDate() { 
      return this.date == null ? null : this.date.getValue();
    }

    /**
     * @param value When the profile was generated.
     */
    public ClinicalProfile setDate(Date value) { 
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
     * @return {@link #source} (Identifier(s) from where the profile was acquired.)
     */
    public List<Identifier> getSource() { 
      if (this.source == null)
        this.source = new ArrayList<Identifier>();
      return this.source;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setSource(List<Identifier> theSource) { 
      this.source = theSource;
      return this;
    }

    public boolean hasSource() { 
      if (this.source == null)
        return false;
      for (Identifier item : this.source)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addSource() { //3
      Identifier t = new Identifier();
      if (this.source == null)
        this.source = new ArrayList<Identifier>();
      this.source.add(t);
      return t;
    }

    public ClinicalProfile addSource(Identifier t) { //3
      if (t == null)
        return this;
      if (this.source == null)
        this.source = new ArrayList<Identifier>();
      this.source.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #source}, creating it if it does not already exist
     */
    public Identifier getSourceFirstRep() { 
      if (getSource().isEmpty()) {
        addSource();
      }
      return getSource().get(0);
    }

    /**
     * @return {@link #reporter} (Who is reporting the data.)
     */
    public Reference getReporter() { 
      if (this.reporter == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create ClinicalProfile.reporter");
        else if (Configuration.doAutoCreate())
          this.reporter = new Reference(); // cc
      return this.reporter;
    }

    public boolean hasReporter() { 
      return this.reporter != null && !this.reporter.isEmpty();
    }

    /**
     * @param value {@link #reporter} (Who is reporting the data.)
     */
    public ClinicalProfile setReporter(Reference value) { 
      this.reporter = value;
      return this;
    }

    /**
     * @return {@link #reporter} The actual object that is the target of the reference. The reference library doesn't populate this, but you can use it to hold the resource if you resolve it. (Who is reporting the data.)
     */
    public Resource getReporterTarget() { 
      return this.reporterTarget;
    }

    /**
     * @param value {@link #reporter} The actual object that is the target of the reference. The reference library doesn't use these, but you can use it to hold the resource if you resolve it. (Who is reporting the data.)
     */
    public ClinicalProfile setReporterTarget(Resource value) { 
      this.reporterTarget = value;
      return this;
    }

    /**
     * @return {@link #lab} (Laboratory profile entry.)
     */
    public List<ClinicalProfileLabComponent> getLab() { 
      if (this.lab == null)
        this.lab = new ArrayList<ClinicalProfileLabComponent>();
      return this.lab;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setLab(List<ClinicalProfileLabComponent> theLab) { 
      this.lab = theLab;
      return this;
    }

    public boolean hasLab() { 
      if (this.lab == null)
        return false;
      for (ClinicalProfileLabComponent item : this.lab)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileLabComponent addLab() { //3
      ClinicalProfileLabComponent t = new ClinicalProfileLabComponent();
      if (this.lab == null)
        this.lab = new ArrayList<ClinicalProfileLabComponent>();
      this.lab.add(t);
      return t;
    }

    public ClinicalProfile addLab(ClinicalProfileLabComponent t) { //3
      if (t == null)
        return this;
      if (this.lab == null)
        this.lab = new ArrayList<ClinicalProfileLabComponent>();
      this.lab.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #lab}, creating it if it does not already exist
     */
    public ClinicalProfileLabComponent getLabFirstRep() { 
      if (getLab().isEmpty()) {
        addLab();
      }
      return getLab().get(0);
    }

    /**
     * @return {@link #medication} (Medication profile entry.)
     */
    public List<ClinicalProfileMedicationComponent> getMedication() { 
      if (this.medication == null)
        this.medication = new ArrayList<ClinicalProfileMedicationComponent>();
      return this.medication;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setMedication(List<ClinicalProfileMedicationComponent> theMedication) { 
      this.medication = theMedication;
      return this;
    }

    public boolean hasMedication() { 
      if (this.medication == null)
        return false;
      for (ClinicalProfileMedicationComponent item : this.medication)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileMedicationComponent addMedication() { //3
      ClinicalProfileMedicationComponent t = new ClinicalProfileMedicationComponent();
      if (this.medication == null)
        this.medication = new ArrayList<ClinicalProfileMedicationComponent>();
      this.medication.add(t);
      return t;
    }

    public ClinicalProfile addMedication(ClinicalProfileMedicationComponent t) { //3
      if (t == null)
        return this;
      if (this.medication == null)
        this.medication = new ArrayList<ClinicalProfileMedicationComponent>();
      this.medication.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #medication}, creating it if it does not already exist
     */
    public ClinicalProfileMedicationComponent getMedicationFirstRep() { 
      if (getMedication().isEmpty()) {
        addMedication();
      }
      return getMedication().get(0);
    }

    /**
     * @return {@link #diagnosis} (Diagnosis profile entry.)
     */
    public List<ClinicalProfileDiagnosisComponent> getDiagnosis() { 
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
      return this.diagnosis;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setDiagnosis(List<ClinicalProfileDiagnosisComponent> theDiagnosis) { 
      this.diagnosis = theDiagnosis;
      return this;
    }

    public boolean hasDiagnosis() { 
      if (this.diagnosis == null)
        return false;
      for (ClinicalProfileDiagnosisComponent item : this.diagnosis)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileDiagnosisComponent addDiagnosis() { //3
      ClinicalProfileDiagnosisComponent t = new ClinicalProfileDiagnosisComponent();
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
      this.diagnosis.add(t);
      return t;
    }

    public ClinicalProfile addDiagnosis(ClinicalProfileDiagnosisComponent t) { //3
      if (t == null)
        return this;
      if (this.diagnosis == null)
        this.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
      this.diagnosis.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #diagnosis}, creating it if it does not already exist
     */
    public ClinicalProfileDiagnosisComponent getDiagnosisFirstRep() { 
      if (getDiagnosis().isEmpty()) {
        addDiagnosis();
      }
      return getDiagnosis().get(0);
    }

    /**
     * @return {@link #procedure} (Procedure profile entry.)
     */
    public List<ClinicalProfileProcedureComponent> getProcedure() { 
      if (this.procedure == null)
        this.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
      return this.procedure;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setProcedure(List<ClinicalProfileProcedureComponent> theProcedure) { 
      this.procedure = theProcedure;
      return this;
    }

    public boolean hasProcedure() { 
      if (this.procedure == null)
        return false;
      for (ClinicalProfileProcedureComponent item : this.procedure)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileProcedureComponent addProcedure() { //3
      ClinicalProfileProcedureComponent t = new ClinicalProfileProcedureComponent();
      if (this.procedure == null)
        this.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
      this.procedure.add(t);
      return t;
    }

    public ClinicalProfile addProcedure(ClinicalProfileProcedureComponent t) { //3
      if (t == null)
        return this;
      if (this.procedure == null)
        this.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
      this.procedure.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #procedure}, creating it if it does not already exist
     */
    public ClinicalProfileProcedureComponent getProcedureFirstRep() { 
      if (getProcedure().isEmpty()) {
        addProcedure();
      }
      return getProcedure().get(0);
    }

    /**
     * @return {@link #hpo} (Phenotypic description.)
     */
    public List<ClinicalProfileHpoComponent> getHpo() { 
      if (this.hpo == null)
        this.hpo = new ArrayList<ClinicalProfileHpoComponent>();
      return this.hpo;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public ClinicalProfile setHpo(List<ClinicalProfileHpoComponent> theHpo) { 
      this.hpo = theHpo;
      return this;
    }

    public boolean hasHpo() { 
      if (this.hpo == null)
        return false;
      for (ClinicalProfileHpoComponent item : this.hpo)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public ClinicalProfileHpoComponent addHpo() { //3
      ClinicalProfileHpoComponent t = new ClinicalProfileHpoComponent();
      if (this.hpo == null)
        this.hpo = new ArrayList<ClinicalProfileHpoComponent>();
      this.hpo.add(t);
      return t;
    }

    public ClinicalProfile addHpo(ClinicalProfileHpoComponent t) { //3
      if (t == null)
        return this;
      if (this.hpo == null)
        this.hpo = new ArrayList<ClinicalProfileHpoComponent>();
      this.hpo.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #hpo}, creating it if it does not already exist
     */
    public ClinicalProfileHpoComponent getHpoFirstRep() { 
      if (getHpo().isEmpty()) {
        addHpo();
      }
      return getHpo().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("status", "code", "The ClinicalProfile status.", 0, 1, status));
        children.add(new Property("population", "Reference(Group)", "The base population against which this profile was generated.", 0, 1, population));
        children.add(new Property("cohort", "Reference(Group)", "The cohort within the population that this profile represents.", 0, 1, cohort));
        children.add(new Property("date", "dateTime", "When the profile was generated.", 0, 1, date));
        children.add(new Property("source", "Identifier", "Identifier(s) from where the profile was acquired.", 0, java.lang.Integer.MAX_VALUE, source));
        children.add(new Property("reporter", "Reference(Organization|Practitioner|PractitionerRole|Location)", "Who is reporting the data.", 0, 1, reporter));
        children.add(new Property("lab", "", "Laboratory profile entry.", 0, java.lang.Integer.MAX_VALUE, lab));
        children.add(new Property("medication", "", "Medication profile entry.", 0, java.lang.Integer.MAX_VALUE, medication));
        children.add(new Property("diagnosis", "", "Diagnosis profile entry.", 0, java.lang.Integer.MAX_VALUE, diagnosis));
        children.add(new Property("procedure", "", "Procedure profile entry.", 0, java.lang.Integer.MAX_VALUE, procedure));
        children.add(new Property("hpo", "", "Phenotypic description.", 0, java.lang.Integer.MAX_VALUE, hpo));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A formal identifier that is used to identify this ClinicalProfile when it is represented in other formats or referenced in a specification, model, design or an instance.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The ClinicalProfile status.", 0, 1, status);
        case -2023558323: /*population*/  return new Property("population", "Reference(Group)", "The base population against which this profile was generated.", 0, 1, population);
        case -1354961931: /*cohort*/  return new Property("cohort", "Reference(Group)", "The cohort within the population that this profile represents.", 0, 1, cohort);
        case 3076014: /*date*/  return new Property("date", "dateTime", "When the profile was generated.", 0, 1, date);
        case -896505829: /*source*/  return new Property("source", "Identifier", "Identifier(s) from where the profile was acquired.", 0, java.lang.Integer.MAX_VALUE, source);
        case -427039519: /*reporter*/  return new Property("reporter", "Reference(Organization|Practitioner|PractitionerRole|Location)", "Who is reporting the data.", 0, 1, reporter);
        case 106893: /*lab*/  return new Property("lab", "", "Laboratory profile entry.", 0, java.lang.Integer.MAX_VALUE, lab);
        case 1998965455: /*medication*/  return new Property("medication", "", "Medication profile entry.", 0, java.lang.Integer.MAX_VALUE, medication);
        case 1196993265: /*diagnosis*/  return new Property("diagnosis", "", "Diagnosis profile entry.", 0, java.lang.Integer.MAX_VALUE, diagnosis);
        case -1095204141: /*procedure*/  return new Property("procedure", "", "Procedure profile entry.", 0, java.lang.Integer.MAX_VALUE, procedure);
        case 103527: /*hpo*/  return new Property("hpo", "", "Phenotypic description.", 0, java.lang.Integer.MAX_VALUE, hpo);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<ClinicalProfileStatus>
        case -2023558323: /*population*/ return this.population == null ? new Base[0] : new Base[] {this.population}; // Reference
        case -1354961931: /*cohort*/ return this.cohort == null ? new Base[0] : new Base[] {this.cohort}; // Reference
        case 3076014: /*date*/ return this.date == null ? new Base[0] : new Base[] {this.date}; // DateTimeType
        case -896505829: /*source*/ return this.source == null ? new Base[0] : this.source.toArray(new Base[this.source.size()]); // Identifier
        case -427039519: /*reporter*/ return this.reporter == null ? new Base[0] : new Base[] {this.reporter}; // Reference
        case 106893: /*lab*/ return this.lab == null ? new Base[0] : this.lab.toArray(new Base[this.lab.size()]); // ClinicalProfileLabComponent
        case 1998965455: /*medication*/ return this.medication == null ? new Base[0] : this.medication.toArray(new Base[this.medication.size()]); // ClinicalProfileMedicationComponent
        case 1196993265: /*diagnosis*/ return this.diagnosis == null ? new Base[0] : this.diagnosis.toArray(new Base[this.diagnosis.size()]); // ClinicalProfileDiagnosisComponent
        case -1095204141: /*procedure*/ return this.procedure == null ? new Base[0] : this.procedure.toArray(new Base[this.procedure.size()]); // ClinicalProfileProcedureComponent
        case 103527: /*hpo*/ return this.hpo == null ? new Base[0] : this.hpo.toArray(new Base[this.hpo.size()]); // ClinicalProfileHpoComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(castToIdentifier(value)); // Identifier
          return value;
        case -892481550: // status
          value = new ClinicalProfileStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<ClinicalProfileStatus>
          return value;
        case -2023558323: // population
          this.population = castToReference(value); // Reference
          return value;
        case -1354961931: // cohort
          this.cohort = castToReference(value); // Reference
          return value;
        case 3076014: // date
          this.date = castToDateTime(value); // DateTimeType
          return value;
        case -896505829: // source
          this.getSource().add(castToIdentifier(value)); // Identifier
          return value;
        case -427039519: // reporter
          this.reporter = castToReference(value); // Reference
          return value;
        case 106893: // lab
          this.getLab().add((ClinicalProfileLabComponent) value); // ClinicalProfileLabComponent
          return value;
        case 1998965455: // medication
          this.getMedication().add((ClinicalProfileMedicationComponent) value); // ClinicalProfileMedicationComponent
          return value;
        case 1196993265: // diagnosis
          this.getDiagnosis().add((ClinicalProfileDiagnosisComponent) value); // ClinicalProfileDiagnosisComponent
          return value;
        case -1095204141: // procedure
          this.getProcedure().add((ClinicalProfileProcedureComponent) value); // ClinicalProfileProcedureComponent
          return value;
        case 103527: // hpo
          this.getHpo().add((ClinicalProfileHpoComponent) value); // ClinicalProfileHpoComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(castToIdentifier(value));
        } else if (name.equals("status")) {
          value = new ClinicalProfileStatusEnumFactory().fromType(castToCode(value));
          this.status = (Enumeration) value; // Enumeration<ClinicalProfileStatus>
        } else if (name.equals("population")) {
          this.population = castToReference(value); // Reference
        } else if (name.equals("cohort")) {
          this.cohort = castToReference(value); // Reference
        } else if (name.equals("date")) {
          this.date = castToDateTime(value); // DateTimeType
        } else if (name.equals("source")) {
          this.getSource().add(castToIdentifier(value));
        } else if (name.equals("reporter")) {
          this.reporter = castToReference(value); // Reference
        } else if (name.equals("lab")) {
          this.getLab().add((ClinicalProfileLabComponent) value);
        } else if (name.equals("medication")) {
          this.getMedication().add((ClinicalProfileMedicationComponent) value);
        } else if (name.equals("diagnosis")) {
          this.getDiagnosis().add((ClinicalProfileDiagnosisComponent) value);
        } else if (name.equals("procedure")) {
          this.getProcedure().add((ClinicalProfileProcedureComponent) value);
        } else if (name.equals("hpo")) {
          this.getHpo().add((ClinicalProfileHpoComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -892481550:  return getStatusElement();
        case -2023558323:  return getPopulation(); 
        case -1354961931:  return getCohort(); 
        case 3076014:  return getDateElement();
        case -896505829:  return addSource(); 
        case -427039519:  return getReporter(); 
        case 106893:  return addLab(); 
        case 1998965455:  return addMedication(); 
        case 1196993265:  return addDiagnosis(); 
        case -1095204141:  return addProcedure(); 
        case 103527:  return addHpo(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case -2023558323: /*population*/ return new String[] {"Reference"};
        case -1354961931: /*cohort*/ return new String[] {"Reference"};
        case 3076014: /*date*/ return new String[] {"dateTime"};
        case -896505829: /*source*/ return new String[] {"Identifier"};
        case -427039519: /*reporter*/ return new String[] {"Reference"};
        case 106893: /*lab*/ return new String[] {};
        case 1998965455: /*medication*/ return new String[] {};
        case 1196993265: /*diagnosis*/ return new String[] {};
        case -1095204141: /*procedure*/ return new String[] {};
        case 103527: /*hpo*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.status");
        }
        else if (name.equals("population")) {
          this.population = new Reference();
          return this.population;
        }
        else if (name.equals("cohort")) {
          this.cohort = new Reference();
          return this.cohort;
        }
        else if (name.equals("date")) {
          throw new FHIRException("Cannot call addChild on a primitive type ClinicalProfile.date");
        }
        else if (name.equals("source")) {
          return addSource();
        }
        else if (name.equals("reporter")) {
          this.reporter = new Reference();
          return this.reporter;
        }
        else if (name.equals("lab")) {
          return addLab();
        }
        else if (name.equals("medication")) {
          return addMedication();
        }
        else if (name.equals("diagnosis")) {
          return addDiagnosis();
        }
        else if (name.equals("procedure")) {
          return addProcedure();
        }
        else if (name.equals("hpo")) {
          return addHpo();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "ClinicalProfile";

  }

      public ClinicalProfile copy() {
        ClinicalProfile dst = new ClinicalProfile();
        copyValues(dst);
        return dst;
      }

      public void copyValues(ClinicalProfile dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.population = population == null ? null : population.copy();
        dst.cohort = cohort == null ? null : cohort.copy();
        dst.date = date == null ? null : date.copy();
        if (source != null) {
          dst.source = new ArrayList<Identifier>();
          for (Identifier i : source)
            dst.source.add(i.copy());
        };
        dst.reporter = reporter == null ? null : reporter.copy();
        if (lab != null) {
          dst.lab = new ArrayList<ClinicalProfileLabComponent>();
          for (ClinicalProfileLabComponent i : lab)
            dst.lab.add(i.copy());
        };
        if (medication != null) {
          dst.medication = new ArrayList<ClinicalProfileMedicationComponent>();
          for (ClinicalProfileMedicationComponent i : medication)
            dst.medication.add(i.copy());
        };
        if (diagnosis != null) {
          dst.diagnosis = new ArrayList<ClinicalProfileDiagnosisComponent>();
          for (ClinicalProfileDiagnosisComponent i : diagnosis)
            dst.diagnosis.add(i.copy());
        };
        if (procedure != null) {
          dst.procedure = new ArrayList<ClinicalProfileProcedureComponent>();
          for (ClinicalProfileProcedureComponent i : procedure)
            dst.procedure.add(i.copy());
        };
        if (hpo != null) {
          dst.hpo = new ArrayList<ClinicalProfileHpoComponent>();
          for (ClinicalProfileHpoComponent i : hpo)
            dst.hpo.add(i.copy());
        };
      }

      protected ClinicalProfile typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof ClinicalProfile))
          return false;
        ClinicalProfile o = (ClinicalProfile) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(population, o.population, true)
           && compareDeep(cohort, o.cohort, true) && compareDeep(date, o.date, true) && compareDeep(source, o.source, true)
           && compareDeep(reporter, o.reporter, true) && compareDeep(lab, o.lab, true) && compareDeep(medication, o.medication, true)
           && compareDeep(diagnosis, o.diagnosis, true) && compareDeep(procedure, o.procedure, true) && compareDeep(hpo, o.hpo, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof ClinicalProfile))
          return false;
        ClinicalProfile o = (ClinicalProfile) other_;
        return compareValues(status, o.status, true) && compareValues(date, o.date, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, population
          , cohort, date, source, reporter, lab, medication, diagnosis, procedure, hpo
          );
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.ClinicalProfile;
   }

 /**
   * Search parameter: <b>date</b>
   * <p>
   * Description: <b>The date of the clinical profile</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ClinicalProfile.date</b><br>
   * </p>
   */
  @SearchParamDefinition(name="date", path="ClinicalProfile.date", description="The date of the clinical profile", type="date" )
  public static final String SP_DATE = "date";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>date</b>
   * <p>
   * Description: <b>The date of the clinical profile</b><br>
   * Type: <b>date</b><br>
   * Path: <b>ClinicalProfile.date</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam DATE = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_DATE);

 /**
   * Search parameter: <b>labcode</b>
   * <p>
   * Description: <b>Lab code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.lab.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="labcode", path="ClinicalProfile.lab.code", description="Lab code", type="token" )
  public static final String SP_LABCODE = "labcode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>labcode</b>
   * <p>
   * Description: <b>Lab code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.lab.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam LABCODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_LABCODE);

 /**
   * Search parameter: <b>medicationcorrelatedphenotype</b>
   * <p>
   * Description: <b>Medication correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcorrelatedphenotype", path="ClinicalProfile.medication.correlatedPhenotypes.entry.code", description="Medication correlated phenotype", type="token" )
  public static final String SP_MEDICATIONCORRELATEDPHENOTYPE = "medicationcorrelatedphenotype";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcorrelatedphenotype</b>
   * <p>
   * Description: <b>Medication correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDICATIONCORRELATEDPHENOTYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDICATIONCORRELATEDPHENOTYPE);

 /**
   * Search parameter: <b>phenotypecorrelatedphenotype</b>
   * <p>
   * Description: <b>Phenotype  correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phenotypecorrelatedphenotype", path="ClinicalProfile.hpo.correlatedPhenotypes.entry.code", description="Phenotype  correlated phenotype", type="token" )
  public static final String SP_PHENOTYPECORRELATEDPHENOTYPE = "phenotypecorrelatedphenotype";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phenotypecorrelatedphenotype</b>
   * <p>
   * Description: <b>Phenotype  correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHENOTYPECORRELATEDPHENOTYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PHENOTYPECORRELATEDPHENOTYPE);

 /**
   * Search parameter: <b>diagnosiscorrelatedphenotype</b>
   * <p>
   * Description: <b>Diagnosis correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="diagnosiscorrelatedphenotype", path="ClinicalProfile.diagnosis.correlatedPhenotypes.entry.code", description="Diagnosis correlated phenotype", type="token" )
  public static final String SP_DIAGNOSISCORRELATEDPHENOTYPE = "diagnosiscorrelatedphenotype";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>diagnosiscorrelatedphenotype</b>
   * <p>
   * Description: <b>Diagnosis correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam DIAGNOSISCORRELATEDPHENOTYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_DIAGNOSISCORRELATEDPHENOTYPE);

 /**
   * Search parameter: <b>cohort</b>
   * <p>
   * Description: <b>The cohort being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.cohort</b><br>
   * </p>
   */
  @SearchParamDefinition(name="cohort", path="ClinicalProfile.cohort", description="The cohort being profiled", type="reference", target={Group.class } )
  public static final String SP_COHORT = "cohort";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>cohort</b>
   * <p>
   * Description: <b>The cohort being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.cohort</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam COHORT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_COHORT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:cohort</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_COHORT = new ca.uhn.fhir.model.api.Include("ClinicalProfile:cohort").toLocked();

 /**
   * Search parameter: <b>procedurecorrelatedphenotype</b>
   * <p>
   * Description: <b>Procedure correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="procedurecorrelatedphenotype", path="ClinicalProfile.procedure.correlatedPhenotypes.entry.code", description="Procedure correlated phenotype", type="token" )
  public static final String SP_PROCEDURECORRELATEDPHENOTYPE = "procedurecorrelatedphenotype";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>procedurecorrelatedphenotype</b>
   * <p>
   * Description: <b>Procedure correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.correlatedPhenotypes.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PROCEDURECORRELATEDPHENOTYPE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PROCEDURECORRELATEDPHENOTYPE);

 /**
   * Search parameter: <b>phenotypecorrelatedprocedure</b>
   * <p>
   * Description: <b>Phenotype  correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phenotypecorrelatedprocedure", path="ClinicalProfile.hpo.correlatedProcedures.entry.code", description="Phenotype  correlated procedure", type="token" )
  public static final String SP_PHENOTYPECORRELATEDPROCEDURE = "phenotypecorrelatedprocedure";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phenotypecorrelatedprocedure</b>
   * <p>
   * Description: <b>Phenotype  correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHENOTYPECORRELATEDPROCEDURE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PHENOTYPECORRELATEDPROCEDURE);

 /**
   * Search parameter: <b>medicationcategory</b>
   * <p>
   * Description: <b>Medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcategory", path="ClinicalProfile.medication.category", description="Medication category", type="token" )
  public static final String SP_MEDICATIONCATEGORY = "medicationcategory";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcategory</b>
   * <p>
   * Description: <b>Medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDICATIONCATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDICATIONCATEGORY);

 /**
   * Search parameter: <b>medicationcorrelatedmedcode</b>
   * <p>
   * Description: <b>Medication correlated medication code</b><br>
   * Type: <b>token</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcorrelatedmedcode", path="", description="Medication correlated medication code", type="token" )
  public static final String SP_MEDICATIONCORRELATEDMEDCODE = "medicationcorrelatedmedcode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcorrelatedmedcode</b>
   * <p>
   * Description: <b>Medication correlated medication code</b><br>
   * Type: <b>token</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDICATIONCORRELATEDMEDCODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDICATIONCORRELATEDMEDCODE);

 /**
   * Search parameter: <b>correlatedlabcode</b>
   * <p>
   * Description: <b>Lab correlated lab code</b><br>
   * Type: <b>token</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="correlatedlabcode", path="", description="Lab correlated lab code", type="token" )
  public static final String SP_CORRELATEDLABCODE = "correlatedlabcode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>correlatedlabcode</b>
   * <p>
   * Description: <b>Lab correlated lab code</b><br>
   * Type: <b>token</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam CORRELATEDLABCODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_CORRELATEDLABCODE);

 /**
   * Search parameter: <b>procedurecorrelatedmedcategory</b>
   * <p>
   * Description: <b>Procedure correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.correlatedMedications.entry.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="procedurecorrelatedmedcategory", path="ClinicalProfile.procedure.correlatedMedications.entry.category", description="Procedure correlated medication category", type="token" )
  public static final String SP_PROCEDURECORRELATEDMEDCATEGORY = "procedurecorrelatedmedcategory";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>procedurecorrelatedmedcategory</b>
   * <p>
   * Description: <b>Procedure correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.correlatedMedications.entry.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PROCEDURECORRELATEDMEDCATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PROCEDURECORRELATEDMEDCATEGORY);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>External identifier of the clinical profile to be returned</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="ClinicalProfile.identifier", description="External identifier of the clinical profile to be returned", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>External identifier of the clinical profile to be returned</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>medicationreference</b>
   * <p>
   * Description: <b>Medication reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.medication.medicationReference</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationreference", path="(ClinicalProfile.medication.medication as Reference)", description="Medication reference", type="reference", target={Medication.class } )
  public static final String SP_MEDICATIONREFERENCE = "medicationreference";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationreference</b>
   * <p>
   * Description: <b>Medication reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.medication.medicationReference</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam MEDICATIONREFERENCE = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_MEDICATIONREFERENCE);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:medicationreference</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_MEDICATIONREFERENCE = new ca.uhn.fhir.model.api.Include("ClinicalProfile:medicationreference").toLocked();

 /**
   * Search parameter: <b>reporter</b>
   * <p>
   * Description: <b>The reporter to return clinical profile results for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.reporter</b><br>
   * </p>
   */
  @SearchParamDefinition(name="reporter", path="ClinicalProfile.reporter", description="The reporter to return clinical profile results for", type="reference", target={Location.class, Organization.class, Practitioner.class, PractitionerRole.class } )
  public static final String SP_REPORTER = "reporter";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>reporter</b>
   * <p>
   * Description: <b>The reporter to return clinical profile results for</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.reporter</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam REPORTER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_REPORTER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:reporter</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_REPORTER = new ca.uhn.fhir.model.api.Include("ClinicalProfile:reporter").toLocked();

 /**
   * Search parameter: <b>procedurecorrelatedprocedure</b>
   * <p>
   * Description: <b>Procedure correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="procedurecorrelatedprocedure", path="ClinicalProfile.procedure.correlatedProcedures.entry.code", description="Procedure correlated procedure", type="token" )
  public static final String SP_PROCEDURECORRELATEDPROCEDURE = "procedurecorrelatedprocedure";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>procedurecorrelatedprocedure</b>
   * <p>
   * Description: <b>Procedure correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PROCEDURECORRELATEDPROCEDURE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PROCEDURECORRELATEDPROCEDURE);

 /**
   * Search parameter: <b>population</b>
   * <p>
   * Description: <b>The  population being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.population</b><br>
   * </p>
   */
  @SearchParamDefinition(name="population", path="ClinicalProfile.population", description="The  population being profiled", type="reference", target={Group.class } )
  public static final String SP_POPULATION = "population";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>population</b>
   * <p>
   * Description: <b>The  population being profiled</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>ClinicalProfile.population</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam POPULATION = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_POPULATION);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:population</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_POPULATION = new ca.uhn.fhir.model.api.Include("ClinicalProfile:population").toLocked();

 /**
   * Search parameter: <b>medicationcorrelatedmedcategory</b>
   * <p>
   * Description: <b>Medication correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedMedications.entry.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcorrelatedmedcategory", path="ClinicalProfile.medication.correlatedMedications.entry.category", description="Medication correlated medication category", type="token" )
  public static final String SP_MEDICATIONCORRELATEDMEDCATEGORY = "medicationcorrelatedmedcategory";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcorrelatedmedcategory</b>
   * <p>
   * Description: <b>Medication correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedMedications.entry.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDICATIONCORRELATEDMEDCATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDICATIONCORRELATEDMEDCATEGORY);

 /**
   * Search parameter: <b>procedurecode</b>
   * <p>
   * Description: <b>Procedure  code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="procedurecode", path="ClinicalProfile.procedure.code", description="Procedure  code", type="token" )
  public static final String SP_PROCEDURECODE = "procedurecode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>procedurecode</b>
   * <p>
   * Description: <b>Procedure  code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.procedure.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PROCEDURECODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PROCEDURECODE);

 /**
   * Search parameter: <b>diagnosiscorrelatedmedcategory</b>
   * <p>
   * Description: <b>Diagnosis correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.correlatedMedications.entry.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="diagnosiscorrelatedmedcategory", path="ClinicalProfile.diagnosis.correlatedMedications.entry.category", description="Diagnosis correlated medication category", type="token" )
  public static final String SP_DIAGNOSISCORRELATEDMEDCATEGORY = "diagnosiscorrelatedmedcategory";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>diagnosiscorrelatedmedcategory</b>
   * <p>
   * Description: <b>Diagnosis correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.correlatedMedications.entry.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam DIAGNOSISCORRELATEDMEDCATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_DIAGNOSISCORRELATEDMEDCATEGORY);

 /**
   * Search parameter: <b>medicationcode</b>
   * <p>
   * Description: <b>Medication code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.medicationCodeableConcept</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcode", path="(ClinicalProfile.medication.medication as CodeableConcept)", description="Medication code", type="token" )
  public static final String SP_MEDICATIONCODE = "medicationcode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcode</b>
   * <p>
   * Description: <b>Medication code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.medicationCodeableConcept</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDICATIONCODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDICATIONCODE);

 /**
   * Search parameter: <b>diagnosiscode</b>
   * <p>
   * Description: <b>Diagnosis code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="diagnosiscode", path="ClinicalProfile.diagnosis.code", description="Diagnosis code", type="token" )
  public static final String SP_DIAGNOSISCODE = "diagnosiscode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>diagnosiscode</b>
   * <p>
   * Description: <b>Diagnosis code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam DIAGNOSISCODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_DIAGNOSISCODE);

 /**
   * Search parameter: <b>phenotypecorrelatedmedcategory</b>
   * <p>
   * Description: <b>Phenotype  correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.correlatedMedications.entry.category</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phenotypecorrelatedmedcategory", path="ClinicalProfile.hpo.correlatedMedications.entry.category", description="Phenotype  correlated medication category", type="token" )
  public static final String SP_PHENOTYPECORRELATEDMEDCATEGORY = "phenotypecorrelatedmedcategory";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phenotypecorrelatedmedcategory</b>
   * <p>
   * Description: <b>Phenotype  correlated medication category</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.correlatedMedications.entry.category</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHENOTYPECORRELATEDMEDCATEGORY = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PHENOTYPECORRELATEDMEDCATEGORY);

 /**
   * Search parameter: <b>medicationcorrelatedprocedure</b>
   * <p>
   * Description: <b>Medication correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcorrelatedprocedure", path="ClinicalProfile.medication.correlatedProcedures.entry.code", description="Medication correlated procedure", type="token" )
  public static final String SP_MEDICATIONCORRELATEDPROCEDURE = "medicationcorrelatedprocedure";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcorrelatedprocedure</b>
   * <p>
   * Description: <b>Medication correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDICATIONCORRELATEDPROCEDURE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDICATIONCORRELATEDPROCEDURE);

 /**
   * Search parameter: <b>medicationcorrelatedmedref</b>
   * <p>
   * Description: <b>Medication correlated medication reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b></b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcorrelatedmedref", path="", description="Medication correlated medication reference", type="reference", target={Medication.class } )
  public static final String SP_MEDICATIONCORRELATEDMEDREF = "medicationcorrelatedmedref";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcorrelatedmedref</b>
   * <p>
   * Description: <b>Medication correlated medication reference</b><br>
   * Type: <b>reference</b><br>
   * Path: <b></b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam MEDICATIONCORRELATEDMEDREF = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_MEDICATIONCORRELATEDMEDREF);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>ClinicalProfile:medicationcorrelatedmedref</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_MEDICATIONCORRELATEDMEDREF = new ca.uhn.fhir.model.api.Include("ClinicalProfile:medicationcorrelatedmedref").toLocked();

 /**
   * Search parameter: <b>medicationcorrelateddiagnosis</b>
   * <p>
   * Description: <b>Medication correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedDiagnoses.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="medicationcorrelateddiagnosis", path="ClinicalProfile.medication.correlatedDiagnoses.entry.code", description="Medication correlated phenotype", type="token" )
  public static final String SP_MEDICATIONCORRELATEDDIAGNOSIS = "medicationcorrelateddiagnosis";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>medicationcorrelateddiagnosis</b>
   * <p>
   * Description: <b>Medication correlated phenotype</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.medication.correlatedDiagnoses.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam MEDICATIONCORRELATEDDIAGNOSIS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_MEDICATIONCORRELATEDDIAGNOSIS);

 /**
   * Search parameter: <b>diagnosiscorrelatedprocedure</b>
   * <p>
   * Description: <b>Diagnosis correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="diagnosiscorrelatedprocedure", path="ClinicalProfile.diagnosis.correlatedProcedures.entry.code", description="Diagnosis correlated procedure", type="token" )
  public static final String SP_DIAGNOSISCORRELATEDPROCEDURE = "diagnosiscorrelatedprocedure";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>diagnosiscorrelatedprocedure</b>
   * <p>
   * Description: <b>Diagnosis correlated procedure</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.diagnosis.correlatedProcedures.entry.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam DIAGNOSISCORRELATEDPROCEDURE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_DIAGNOSISCORRELATEDPROCEDURE);

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The status of the profile</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="ClinicalProfile.status", description="The status of the profile", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The status of the profile</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>phenotypecode</b>
   * <p>
   * Description: <b>Phenotype  code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.code</b><br>
   * </p>
   */
  @SearchParamDefinition(name="phenotypecode", path="ClinicalProfile.hpo.code", description="Phenotype  code", type="token" )
  public static final String SP_PHENOTYPECODE = "phenotypecode";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>phenotypecode</b>
   * <p>
   * Description: <b>Phenotype  code</b><br>
   * Type: <b>token</b><br>
   * Path: <b>ClinicalProfile.hpo.code</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam PHENOTYPECODE = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_PHENOTYPECODE);


}

