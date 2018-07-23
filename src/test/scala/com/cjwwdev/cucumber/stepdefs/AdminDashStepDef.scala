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

class AdminDashStepDef extends ScalaDsl with EN with BasePage {

  Given("""^the user is on the admin dashboard$""") { () =>
    navigateToPage(s"$baseUrl/dashboard")
    verifyPageByTitle("main-heading", "Welcome to the admin dashboard")
  }

  And("""^all main dashboard links are correct for the root user$""") { () =>
    verifyDivIsDisplayed("register-user-dash-link")
    verifyText("register-user-dash-link-caption", "Register user")

    verifyDivIsDisplayed("view-users-dash-link")
    verifyText("view-users-dash-link-caption", "View users")

    verifyDivIsDisplayed("data-sec-dash-link")
    verifyText("data-sec-dash-link-caption", "Data security")

    verifyDivIsDisplayed("sha-dash-link")
    verifyText("sha-dash-link-caption", "SHA512")
  }
}
