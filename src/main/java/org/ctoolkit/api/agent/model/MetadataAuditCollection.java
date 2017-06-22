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
 * on 2017-06-21 at 20:13:32 UTC 
 * Modify at your own risk.
 */

package org.ctoolkit.api.agent.model;

/**
 * Model definition for MetadataAuditCollection.
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
public final class MetadataAuditCollection extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetadataAudit> items;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<MetadataAudit> getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public MetadataAuditCollection setItems(java.util.List<MetadataAudit> items) {
    this.items = items;
    return this;
  }

  @Override
  public MetadataAuditCollection set(String fieldName, Object value) {
    return (MetadataAuditCollection) super.set(fieldName, value);
  }

  @Override
  public MetadataAuditCollection clone() {
    return (MetadataAuditCollection) super.clone();
  }

}
