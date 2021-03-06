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
package com.cjwwdev.cucumber.utils

import java.util.UUID

import org.openqa.selenium.By
import org.scalatest.Assertion

import scala.util.Try

object BasePage extends BasePage

trait BasePage extends NavigationUtils with VerificationUtils with DataEntryUtils {

  override val driver = SingletonDriver.getInstance()

  val baseUrl: String = "http://localhost:9875/administration"

  def shutdownBrowser(): Unit = driver.quit()

  def uuidValidator(id: String): Assertion = assert(Try(UUID.fromString(driver.findElement(By.id(id)).getText)).isSuccess)
}
