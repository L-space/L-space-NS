package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object Organization
    extends OntologyDef(
      iri = "http://schema.org/Organization",
      iris = Set("http://schema.org/Organization"),
      label = "Organization",
      comment = """An organization such as a school, NGO, corporation, club, etc.""",
      `@extends` = () => List(Thing.ontology)
    ) {
  object keys extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val member                   = lspace.ns.vocab.schema.member.property
    lazy val areaServed               = lspace.ns.vocab.schema.areaServed.property
    lazy val publishingPrinciples     = lspace.ns.vocab.schema.publishingPrinciples.property
    lazy val aggregateRating          = lspace.ns.vocab.schema.aggregateRating.property
    lazy val email                    = lspace.ns.vocab.schema.email.property
    lazy val numberOfEmployees        = lspace.ns.vocab.schema.numberOfEmployees.property
    lazy val faxNumber                = lspace.ns.vocab.schema.faxNumber.property
    lazy val naics                    = lspace.ns.vocab.schema.naics.property
    lazy val knowsLanguage            = lspace.ns.vocab.schema.knowsLanguage.property
    lazy val makesOffer               = lspace.ns.vocab.schema.makesOffer.property
    lazy val members                  = lspace.ns.vocab.schema.members.property
    lazy val actionableFeedbackPolicy = lspace.ns.vocab.schema.actionableFeedbackPolicy.property
    lazy val events                   = lspace.ns.vocab.schema.events.property
    lazy val employees                = lspace.ns.vocab.schema.employees.property
    lazy val employee                 = lspace.ns.vocab.schema.employee.property
    lazy val founders                 = lspace.ns.vocab.schema.founders.property
    lazy val globalLocationNumber     = lspace.ns.vocab.schema.globalLocationNumber.property
    lazy val founder                  = lspace.ns.vocab.schema.founder.property
    lazy val alumni                   = lspace.ns.vocab.schema.alumni.property
    lazy val duns                     = lspace.ns.vocab.schema.duns.property
    lazy val awards                   = lspace.ns.vocab.schema.awards.property
    lazy val ethicsPolicy             = lspace.ns.vocab.schema.ethicsPolicy.property
    lazy val taxID                    = lspace.ns.vocab.schema.taxID.property
    lazy val award                    = lspace.ns.vocab.schema.award.property
    lazy val knowsAbout               = lspace.ns.vocab.schema.knowsAbout.property
    lazy val slogan                   = lspace.ns.vocab.schema.slogan.property
    lazy val parentOrganization       = lspace.ns.vocab.schema.parentOrganization.property
    lazy val location                 = lspace.ns.vocab.schema.location.property
    lazy val foundingLocation         = lspace.ns.vocab.schema.foundingLocation.property
    lazy val correctionsPolicy        = lspace.ns.vocab.schema.correctionsPolicy.property
    lazy val memberOf                 = lspace.ns.vocab.schema.memberOf.property
    lazy val diversityPolicy          = lspace.ns.vocab.schema.diversityPolicy.property
    lazy val contactPoints            = lspace.ns.vocab.schema.contactPoints.property
    lazy val reviews                  = lspace.ns.vocab.schema.reviews.property
    lazy val legalName                = lspace.ns.vocab.schema.legalName.property
    lazy val event                    = lspace.ns.vocab.schema.event.property
    lazy val unnamedSourcesPolicy     = lspace.ns.vocab.schema.unnamedSourcesPolicy.property
    lazy val logo                     = lspace.ns.vocab.schema.logo.property
    lazy val telephone                = lspace.ns.vocab.schema.telephone.property
    lazy val isicV4                   = lspace.ns.vocab.schema.isicV4.property
    lazy val brand                    = lspace.ns.vocab.schema.brand.property
    lazy val foundingDate             = lspace.ns.vocab.schema.foundingDate.property
    lazy val vatID                    = lspace.ns.vocab.schema.vatID.property
    lazy val contactPoint             = lspace.ns.vocab.schema.contactPoint.property
    lazy val diversityStaffingReport  = lspace.ns.vocab.schema.diversityStaffingReport.property
    lazy val department               = lspace.ns.vocab.schema.department.property
    lazy val hasOfferCatalog          = lspace.ns.vocab.schema.hasOfferCatalog.property
    lazy val owns                     = lspace.ns.vocab.schema.owns.property
    lazy val review                   = lspace.ns.vocab.schema.review.property
    lazy val ownershipFundingInfo     = lspace.ns.vocab.schema.ownershipFundingInfo.property
    lazy val hasPOS                   = lspace.ns.vocab.schema.hasPOS.property
    lazy val subOrganization          = lspace.ns.vocab.schema.subOrganization.property
    lazy val seeks                    = lspace.ns.vocab.schema.seeks.property
    lazy val dissolutionDate          = lspace.ns.vocab.schema.dissolutionDate.property
    lazy val leiCode                  = lspace.ns.vocab.schema.leiCode.property
  }
  override lazy val properties: List[LProperty] = List(
    member,
    areaServed,
    publishingPrinciples,
    aggregateRating,
    email,
    numberOfEmployees,
    faxNumber,
    naics,
    knowsLanguage,
    makesOffer,
    members,
    actionableFeedbackPolicy,
    events,
    employees,
    employee,
    founders,
    globalLocationNumber,
    founder,
    alumni,
    duns,
    awards,
    ethicsPolicy,
    taxID,
    award,
    knowsAbout,
    slogan,
    parentOrganization,
    location,
    foundingLocation,
    correctionsPolicy,
    memberOf,
    diversityPolicy,
    contactPoints,
    reviews,
    legalName,
    event,
    unnamedSourcesPolicy,
    logo,
    telephone,
    isicV4,
    brand,
    foundingDate,
    vatID,
    contactPoint,
    diversityStaffingReport,
    department,
    hasOfferCatalog,
    owns,
    review,
    ownershipFundingInfo,
    hasPOS,
    subOrganization,
    seeks,
    dissolutionDate,
    leiCode
  )
  trait Properties extends lspace.ns.vocab.schema.Thing.Properties {
    lazy val member                   = lspace.ns.vocab.schema.member.property
    lazy val areaServed               = lspace.ns.vocab.schema.areaServed.property
    lazy val publishingPrinciples     = lspace.ns.vocab.schema.publishingPrinciples.property
    lazy val aggregateRating          = lspace.ns.vocab.schema.aggregateRating.property
    lazy val email                    = lspace.ns.vocab.schema.email.property
    lazy val numberOfEmployees        = lspace.ns.vocab.schema.numberOfEmployees.property
    lazy val faxNumber                = lspace.ns.vocab.schema.faxNumber.property
    lazy val naics                    = lspace.ns.vocab.schema.naics.property
    lazy val knowsLanguage            = lspace.ns.vocab.schema.knowsLanguage.property
    lazy val makesOffer               = lspace.ns.vocab.schema.makesOffer.property
    lazy val members                  = lspace.ns.vocab.schema.members.property
    lazy val actionableFeedbackPolicy = lspace.ns.vocab.schema.actionableFeedbackPolicy.property
    lazy val events                   = lspace.ns.vocab.schema.events.property
    lazy val employees                = lspace.ns.vocab.schema.employees.property
    lazy val employee                 = lspace.ns.vocab.schema.employee.property
    lazy val founders                 = lspace.ns.vocab.schema.founders.property
    lazy val globalLocationNumber     = lspace.ns.vocab.schema.globalLocationNumber.property
    lazy val founder                  = lspace.ns.vocab.schema.founder.property
    lazy val alumni                   = lspace.ns.vocab.schema.alumni.property
    lazy val duns                     = lspace.ns.vocab.schema.duns.property
    lazy val awards                   = lspace.ns.vocab.schema.awards.property
    lazy val ethicsPolicy             = lspace.ns.vocab.schema.ethicsPolicy.property
    lazy val taxID                    = lspace.ns.vocab.schema.taxID.property
    lazy val award                    = lspace.ns.vocab.schema.award.property
    lazy val knowsAbout               = lspace.ns.vocab.schema.knowsAbout.property
    lazy val slogan                   = lspace.ns.vocab.schema.slogan.property
    lazy val parentOrganization       = lspace.ns.vocab.schema.parentOrganization.property
    lazy val location                 = lspace.ns.vocab.schema.location.property
    lazy val foundingLocation         = lspace.ns.vocab.schema.foundingLocation.property
    lazy val correctionsPolicy        = lspace.ns.vocab.schema.correctionsPolicy.property
    lazy val memberOf                 = lspace.ns.vocab.schema.memberOf.property
    lazy val diversityPolicy          = lspace.ns.vocab.schema.diversityPolicy.property
    lazy val contactPoints            = lspace.ns.vocab.schema.contactPoints.property
    lazy val reviews                  = lspace.ns.vocab.schema.reviews.property
    lazy val legalName                = lspace.ns.vocab.schema.legalName.property
    lazy val event                    = lspace.ns.vocab.schema.event.property
    lazy val unnamedSourcesPolicy     = lspace.ns.vocab.schema.unnamedSourcesPolicy.property
    lazy val logo                     = lspace.ns.vocab.schema.logo.property
    lazy val telephone                = lspace.ns.vocab.schema.telephone.property
    lazy val isicV4                   = lspace.ns.vocab.schema.isicV4.property
    lazy val brand                    = lspace.ns.vocab.schema.brand.property
    lazy val foundingDate             = lspace.ns.vocab.schema.foundingDate.property
    lazy val vatID                    = lspace.ns.vocab.schema.vatID.property
    lazy val contactPoint             = lspace.ns.vocab.schema.contactPoint.property
    lazy val diversityStaffingReport  = lspace.ns.vocab.schema.diversityStaffingReport.property
    lazy val department               = lspace.ns.vocab.schema.department.property
    lazy val hasOfferCatalog          = lspace.ns.vocab.schema.hasOfferCatalog.property
    lazy val owns                     = lspace.ns.vocab.schema.owns.property
    lazy val review                   = lspace.ns.vocab.schema.review.property
    lazy val ownershipFundingInfo     = lspace.ns.vocab.schema.ownershipFundingInfo.property
    lazy val hasPOS                   = lspace.ns.vocab.schema.hasPOS.property
    lazy val subOrganization          = lspace.ns.vocab.schema.subOrganization.property
    lazy val seeks                    = lspace.ns.vocab.schema.seeks.property
    lazy val dissolutionDate          = lspace.ns.vocab.schema.dissolutionDate.property
    lazy val leiCode                  = lspace.ns.vocab.schema.leiCode.property
  }
}
