package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.Label.D._
import lspace.Label.P._
import lspace.structure.{Property => LProperty, PropertyDef}
object enginePower extends PropertyDef(
        iri = "http://schema.org/enginePower",
        iris = Set("http://schema.org/enginePower"),
        label = "enginePower",
        comment = """The power of the vehicle's engine.
    Typical unit code(s): KWT for kilowatt, BHP for brake horsepower, N12 for metric horsepower (PS, with 1 PS = 735,49875 W)<br/><br/>

<ul>
<li>Note 1: There are many different ways of measuring an engine's power. For an overview, see  <a href="http://en.wikipedia.org/wiki/Horsepower#Engine_power_test_codes">http://en.wikipedia.org/wiki/Horsepower#Engine<em>power</em>test_codes</a>.</li>
<li>Note 2: You can link to information about how the given value has been determined using the <a class="localLink" href="http://schema.org/valueReference">valueReference</a> property.</li>
<li>Note 3: You can use <a class="localLink" href="http://schema.org/minValue">minValue</a> and <a class="localLink" href="http://schema.org/maxValue">maxValue</a> to indicate ranges.</li>
</ul>
""",
        `@extends` = List(),
        `@range` = List(QuantitativeValue.ontology)
       ){

override lazy val properties: List[LProperty] = List()
trait Properties 
}