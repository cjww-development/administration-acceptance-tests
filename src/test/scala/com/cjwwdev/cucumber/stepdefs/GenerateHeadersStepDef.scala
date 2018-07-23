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

class GenerateHeadersStepDef extends ScalaDsl with EN with BasePage {

  Given("""^the user is on the generate headers page$""") { () =>
    navigateToPage(s"$baseUrl/generate-headers")
    verifyPageByTitle("main-heading", "Generate headers")
  }

  And("""^the user enters the appId$""") { dataTable: DataTable =>
    enterDataFromTable(dataTable)
  }

  And("""^the user clicks generate$""") { () =>
    clickButtonById("generate-headers-submit")
  }

  Then("""^the errors should display without the headers well$""") { () =>
    verifyPageByTitle("main-heading", "Generate headers")
    verifyText("appId-error", "You have not entered the form value for key Application Id")
    verifyDivIsNotDisplayed("generated-header-well")
  }

  Then("""^the page is reloaded with the generated header$""") { () =>
    verifyPageByTitle("main-heading", "Generate headers")
    verifyDivIsDisplayed("generated-header-well")
  }
}
