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
    "com.github.detro.ghostdriver"  %  "phantomjsdriver"           % "1.1.0",
    "org.seleniumhq.selenium"       %  "selenium-java"             % "2.53.1",
    "org.seleniumhq.selenium"       %  "selenium-firefox-driver"   % "2.53.1",
    "org.seleniumhq.selenium"       %  "selenium-chrome-driver"    % "2.53.1",
    "org.seleniumhq.selenium"       %  "selenium-htmlunit-driver"  % "2.52.0",
    "com.typesafe.play"             %% "play-json"                 % "2.6.9",
    "org.scalatest"                 %% "scalatest"                 % "3.0.1",
    "org.pegdown"                   %  "pegdown"                   % "1.1.0",
    "info.cukes"                    %% "cucumber-scala"            % "1.2.4",
    "info.cukes"                    %  "cucumber-junit"            % "1.2.2",
    "info.cukes"                    %  "cucumber-picocontainer"    % "1.2.2",
    "junit"                         %  "junit"                     % "4.12",
    "com.novocode"                  %  "junit-interface"           % "0.10",
    "com.fasterxml.jackson.core"    %  "jackson-databind"          % "2.7.2",
    "com.fasterxml.jackson.module"  %  "jackson-module-scala_2.10" % "2.7.2",
    "log4j"                         %  "log4j"                     % "1.2.17"
  )
}
