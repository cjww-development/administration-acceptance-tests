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

class RegisterAndViewStepDef extends ScalaDsl with EN with BasePage {

  Given("""^the user is on the registration page$""") { () =>
    navigateToPage(s"$baseUrl/dashboard")
    verifyPageByTitle("main-heading", "Welcome to the admin dashboard")
    clickButtonById("registration-link")
    verifyPageByTitle("main-heading", "Register new admin user")
  }

  And("""^the user has entered the new users details$""") { dataTable: DataTable =>
    enterDataFromTable(dataTable)
    clickButtonById("register-submit")
  }

  Then("""^the user is on the view user page$""") { () =>
    verifyPageByTitle("main-heading", "All registered users")
  }

  And("""^the new user is displayed on the users overview page$""") { () =>
    verifyDivIsDisplayed("testuser-details")
  }

  Then("""^the new users details are viewed$""") { () =>
    clickButtonById("testuser-details-link")
    verifyPageByTitle("main-heading", "Details for user testuser")
  }

  And("""^the users details are display on the page$""") { () =>
    verifyTextContains("managementId", "Management Id: management-")
    verifyText("username", "User name: testuser")
    verifyText("email", "Email: test1@email.com")
    verifyText("permissions", "Permissions: all")
  }

  Then("""^the new user is deleted and the user is returned to user overview$""") { () =>
    clickButtonById("delete-user")
    verifyPageByTitle("main-heading", "All registered users")
  }
}
