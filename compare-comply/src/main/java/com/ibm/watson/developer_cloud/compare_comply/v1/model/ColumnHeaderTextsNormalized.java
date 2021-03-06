/*
 * Copyright 2018 IBM Corp. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.developer_cloud.compare_comply.v1.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.watson.developer_cloud.service.model.GenericModel;

/**
 * If you provide customization input, the normalized version of the column header texts according to the customization;
 * otherwise, the same value as `column_header_texts`.
 */
public class ColumnHeaderTextsNormalized extends GenericModel {

  @SerializedName("text_normalized")
  private String textNormalized;

  /**
   * Gets the textNormalized.
   *
   * The normalized version of a column header text.
   *
   * @return the textNormalized
   */
  public String getTextNormalized() {
    return textNormalized;
  }
}
