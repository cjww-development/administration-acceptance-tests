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

class SHA512StepDef extends ScalaDsl with EN with BasePage {

  Given("""^the user is on the enc and dec dash$""") { () =>
    navigateToPage(s"$baseUrl/dashboard")
    verifyPageByTitle("main-heading", "Welcome to the admin dashboard")
    clickButtonById("enc-dec-link")
    verifyPageByTitle("main-heading", "Encrypt and decrypt values")
  }

  Then("""^the user selects SHA512$""") { () =>
    navigateToPage(s"$baseUrl/encrypt-using-sha-512")
    //clickButtonById("sha-link")
    verifyPageByTitle("main-heading", "Encrypt using SHA-512")
  }

  And("""^the user enters the value they want encrypting$""") { dataTable: DataTable =>
    enterDataFromTable(dataTable)
    clickButtonById("encrypt-submit")
  }

  Then("""^the page reloads with the users encrypted value$""") { () =>
    verifyTextDoesNotEqual("data", "test")
  }
}
