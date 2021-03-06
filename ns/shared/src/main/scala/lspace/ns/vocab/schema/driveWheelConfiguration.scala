package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object driveWheelConfiguration extends PropertyDef(
        iri = "http://schema.org/driveWheelConfiguration",
        iris = Set("http://schema.org/driveWheelConfiguration"),
        label = "driveWheelConfiguration",
        comment = """The drive wheel configuration, i.e. which roadwheels will receive torque from the vehicle's engine via the drivetrain.""",
        `@extends` = List(),
        `@range` = List(DriveWheelConfigurationValue.ontology, `@string`)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}