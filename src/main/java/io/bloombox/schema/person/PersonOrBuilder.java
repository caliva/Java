/*
 * Copyright 2017, Bloombox, LLC.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person/Person.proto

package io.bloombox.schema.person;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:person.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.person.Name name = 1;</code>
   */
  boolean hasName();
  /**
   * <code>.person.Name name = 1;</code>
   */
  io.bloombox.schema.person.Name getName();
  /**
   * <code>.person.Name name = 1;</code>
   */
  io.bloombox.schema.person.NameOrBuilder getNameOrBuilder();

  /**
   * <code>.person.Name legal_name = 2;</code>
   */
  boolean hasLegalName();
  /**
   * <code>.person.Name legal_name = 2;</code>
   */
  io.bloombox.schema.person.Name getLegalName();
  /**
   * <code>.person.Name legal_name = 2;</code>
   */
  io.bloombox.schema.person.NameOrBuilder getLegalNameOrBuilder();

  /**
   * <code>.person.Name alternate_name = 3;</code>
   */
  boolean hasAlternateName();
  /**
   * <code>.person.Name alternate_name = 3;</code>
   */
  io.bloombox.schema.person.Name getAlternateName();
  /**
   * <code>.person.Name alternate_name = 3;</code>
   */
  io.bloombox.schema.person.NameOrBuilder getAlternateNameOrBuilder();

  /**
   * <pre>
   * Phone number and Email
   * </pre>
   *
   * <code>.contact.ContactInfo contact = 4;</code>
   */
  boolean hasContact();
  /**
   * <pre>
   * Phone number and Email
   * </pre>
   *
   * <code>.contact.ContactInfo contact = 4;</code>
   */
  io.bloombox.schema.contact.ContactInfo getContact();
  /**
   * <pre>
   * Phone number and Email
   * </pre>
   *
   * <code>.contact.ContactInfo contact = 4;</code>
   */
  io.bloombox.schema.contact.ContactInfoOrBuilder getContactOrBuilder();

  /**
   * <pre>
   * Date of Birth
   * </pre>
   *
   * <code>.temporal.Date date_of_birth = 5;</code>
   */
  boolean hasDateOfBirth();
  /**
   * <pre>
   * Date of Birth
   * </pre>
   *
   * <code>.temporal.Date date_of_birth = 5;</code>
   */
  io.bloombox.schema.temporal.Date getDateOfBirth();
  /**
   * <pre>
   * Date of Birth
   * </pre>
   *
   * <code>.temporal.Date date_of_birth = 5;</code>
   */
  io.bloombox.schema.temporal.DateOrBuilder getDateOfBirthOrBuilder();
}
