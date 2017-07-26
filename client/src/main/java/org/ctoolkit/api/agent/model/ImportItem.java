/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2017-02-15 17:18:02 UTC)
 * on 2017-07-26 at 09:50:53 UTC 
 * Modify at your own risk.
 */

package org.ctoolkit.api.agent.model;

/**
 * Model definition for ImportItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Toolkit Migration Agent. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportItem extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime createDate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String data;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private Long dataLength;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String dataType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String error;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String fileName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String name;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String state;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime updateDate;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getCreateDate() {
    return createDate;
  }

  /**
   * @param createDate createDate or {@code null} for none
   */
  public ImportItem setCreateDate(com.google.api.client.util.DateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public String getData() {
    return data;
  }

  /**

   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public ImportItem setData(String data) {
    this.data = data;
    return this;
  }

  /**

   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ImportItem encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Long getDataLength() {
    return dataLength;
  }

  /**
   * @param dataLength dataLength or {@code null} for none
   */
  public ImportItem setDataLength(Long dataLength) {
    this.dataLength = dataLength;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * @param dataType dataType or {@code null} for none
   */
  public ImportItem setDataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getError() {
    return error;
  }

  /**
   * @param error error or {@code null} for none
   */
  public ImportItem setError(String error) {
    this.error = error;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getFileName() {
    return fileName;
  }

  /**
   * @param fileName fileName or {@code null} for none
   */
  public ImportItem setFileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public ImportItem setId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public ImportItem setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getState() {
    return state;
  }

  /**
   * @param state state or {@code null} for none
   */
  public ImportItem setState(String state) {
    this.state = state;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getUpdateDate() {
    return updateDate;
  }

  /**
   * @param updateDate updateDate or {@code null} for none
   */
  public ImportItem setUpdateDate(com.google.api.client.util.DateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  @Override
  public ImportItem set(String fieldName, Object value) {
    return (ImportItem) super.set(fieldName, value);
  }

  @Override
  public ImportItem clone() {
    return (ImportItem) super.clone();
  }

}