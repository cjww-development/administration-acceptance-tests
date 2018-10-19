/*
 * Copyright 2018 CJWW Development
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

package com.cjwwdev.cucumber.stepdefs

import com.cjwwdev.cucumber.utils.BasePage
import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}

class DataSecurityStepDef extends ScalaDsl with EN with BasePage {

  Given("""^the user is on the data sec page$""") { () =>
    navigateToPage(s"$baseUrl/encrypt-decrypt-using-data-sec")
    verifyPageByTitle("main-heading", "Encrypt or decrypt using data security")
  }

  And("""^the user has chosen encrypt$""") { () =>
    clickButtonById("mode1-label")
  }

  And("""^the user chosen decrypt$""") { () =>
    clickButtonById("mode2-label")
  }

  And("""^has entered the data they want to encrypt$""") { dataTable: DataTable =>
    enterDataFromTable(dataTable)
  }

  And("""^has entered the data they want to decrypt$""") { dataTable: DataTable =>
    enterDataFromTable(dataTable)
  }

  Then("""^the process button has been clicked$""") { () =>
    clickButtonById("data-sec-submit")
  }

  Then("""^the page will reload and display the encrypted value$""") { () =>
    verifyPageByTitle("main-heading", "Encrypt or decrypt using data security")
    verifyDivHasClass("data-text-area", "has-success has-feedback")
  }

  Then("""^the page will reload and display the decrypted value$""") { () =>
    verifyPageByTitle("main-heading", "Encrypt or decrypt using data security")
    verifyDivHasClass("data-text-area", "has-success has-feedback")
  }
}
