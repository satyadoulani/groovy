/*
 * Copyright 2010-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

ruleset {    
    ruleset('rulesets/imports.xml')

    ruleset('rulesets/naming.xml') {
//        exclude 'PropertyName'
//        exclude 'PackageName'   // TODO is plugAndPlay package correct? 
//        'ClassName' {
//            regex = '.*'  // '^[A-Z][a-zA-Z0-9]*$'   // TODO: refine correct regex
//        }
//        'FieldName' {
//            finalRegex = '.*' // '^_?[a-z][a-zA-Z0-9]*$'        // TODO: refine correct regex
//            staticFinalRegex = '.*' //  '^[A-Z][A-Z_0-9]*$'     // TODO: refine correct regex
//        }
//        'MethodName' {
//            regex = '.*'  // '^[a-z][a-zA-Z0-9_]*$'     // TODO: refine correct regex
//        }
//        'VariableName' {
//            regex = '.*' // '^_?[a-z][a-zA-Z0-9]*$'    // TODO: refine correct regex
//            finalRegex = '.*' // '^_?[a-z][a-zA-Z0-9]*$'    // TODO: refine correct regex
//        }
    }
    ruleset('rulesets/grails.xml')
    ruleset('rulesets/logging.xml') 
    ruleset('rulesets/braces.xml') {
        exclude 'IfStatementBraces' // if statements without braces seems acceptable in our coding standards
        exclude 'ElseBlockBraces'   // else statements without braces seems acceptable in our coding standards
    }
    ruleset('rulesets/basic.xml') 
    ruleset('rulesets/size.xml') 
    ruleset('rulesets/junit.xml') 
    ruleset('rulesets/concurrency.xml') 
    ruleset('rulesets/unnecessary.xml') {
        exclude 'UnnecessaryObjectReferences' // CodeNarc 0.12 has a bug
    }
    ruleset('rulesets/dry.xml') 
    ruleset('rulesets/design.xml') 
    ruleset('rulesets/exceptions.xml') 
    ruleset('rulesets/unused.xml') 
}

