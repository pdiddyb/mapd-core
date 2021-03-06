/*
 * Copyright 2017 MapD Technologies, Inc.
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

package com.mapd.calcite.parser;

import org.apache.calcite.rel.type.RelDataTypeFactory;
import org.apache.calcite.sql.SqlOperatorTable;
import org.apache.calcite.sql.validate.SqlConformance;
import org.apache.calcite.sql.validate.SqlValidatorCatalogReader;
import org.apache.calcite.sql.validate.SqlValidatorImpl;

/**
 *
 * @author michael
 */
public class MapDValidator extends SqlValidatorImpl {

  public MapDValidator(
          SqlOperatorTable opTab,
          SqlValidatorCatalogReader catalogReader,
          RelDataTypeFactory typeFactory,
          SqlConformance conformance) {
    super(opTab, catalogReader, typeFactory, conformance);
  }

  // override SqlValidator
  @Override
  public boolean shouldExpandIdentifiers() {
    return true;
  }
}

