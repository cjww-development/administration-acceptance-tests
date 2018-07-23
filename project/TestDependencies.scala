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

import sbt._

object TestDependencies {
  def apply(): Seq[ModuleID] = Seq(
    "org.seleniumhq.selenium"       % "selenium-java"            % "3.13.0"    % Test,
    "org.seleniumhq.selenium"       % "selenium-firefox-driver"  % "3.13.0",
    "org.seleniumhq.selenium"       % "selenium-chrome-driver"   % "3.13.0",
    "org.seleniumhq.selenium"       % "selenium-htmlunit-driver" % "2.52.0"   % Test,
    "com.typesafe.play"            %% "play-json"                % "2.6.9",
    "org.scalatest"                %% "scalatest"                % "3.0.5"    % Test,
    "org.pegdown"                   % "pegdown"                  % "1.6.0"    % Test,
    "info.cukes"                   %% "cucumber-scala"           % "1.2.5"    % Test,
    "info.cukes"                    % "cucumber-junit"           % "1.2.5"    % Test,
    "info.cukes"                    % "cucumber-picocontainer"   % "1.2.5"    % Test,
    "junit"                         % "junit"                    % "4.12"     % Test,
    "com.novocode"                  % "junit-interface"          % "0.11"     % Test,
    "com.fasterxml.jackson.core"    % "jackson-databind"         % "2.9.6",
    "com.fasterxml.jackson.module" %% "jackson-module-scala"     % "2.9.6",
    "log4j"                         % "log4j"                    % "1.2.17",
    "net.lightbody.bmp"             % "browsermob-core"          % "2.1.5"    % Test
  )
}