package org.mock.test

/**
 * Created by evgeniikorniichuk on 13/03/15.
 */
class MacroAnnotationSuite  extends MacroAnnotationSpec {

  def instance = new  MacroAnnotatedClass

   describe("Macro Annotated class ") {

     describe("should have") {
       it("dummy method with returns dummy string") {
         assert(instance.dummy == "dummy")
       }

       it("hello method with returns hello string") {
         assert(instance.hello == "hello")
       }

     }
   }
}
