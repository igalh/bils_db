package buls_db.services

import org.specs2.mutable.SpecificationWithJUnit


class OCRServiceTest extends SpecificationWithJUnit {
 "a" should {
   "test" in {
     new OCRService().toText("/Users/igalh/Downloads/testImage.png") must equalTo("s")
   }
 }
}
