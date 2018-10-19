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
import cucumber.api.scala.{EN, ScalaDsl}

class UUIDStepDef extends ScalaDsl with EN with BasePage {

  Given("""^the user is on the uuid page$""") { () =>
    navigateToPage(s"$baseUrl/generate-uuid")
    verifyPageByTitle("main-heading", "Generate a UUID")
  }

  And("""^the user has clicked generate$""") { () =>
    clickButtonById("generate-uuid")
    verifyPageByTitle("main-heading", "Generate a UUID")
  }

  Then("""^the page should display a UUID$""") { () =>
    uuidValidator("generated-uuid")
  }
}
