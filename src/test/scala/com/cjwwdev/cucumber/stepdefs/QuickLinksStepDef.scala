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

class QuickLinksStepDef extends ScalaDsl with EN with BasePage {
  And("""^all side bar links are correct for the root user$""") { () =>
    verifyText("dashboard-link",      "Dashboard")
    verifyText("registration-link",   "Register user")
    verifyText("view-all-users-link", "View users")
    verifyText("enc-dec-link",        "Encrypt and decrypt")
  }
}
