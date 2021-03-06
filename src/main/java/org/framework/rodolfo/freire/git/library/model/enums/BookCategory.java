package org.framework.rodolfo.freire.git.library.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum BookCategory {

    ADMINISTRATION("ADMINISTRATION"),
    AGRICULTURE("AGRICULTURE"),
    ANTHROPOLOGY("ANTHROPOLOGY"),
    ARCHEOLOGY("ARCHAEOLOGY"),
    ARCHITECTURE("ARCHITECTURE"),
    ARTS("ARTS"),
    ASTRONOMY("ASTRONOMY"),
    BIOLOGY("BIOLOGY"),
    BOTANY("BOTANY"),
    POLITICAL_SCIENCE("POLITICAL SCIENCE"),
    EXACT_SCIENCES("EXACT SCIENCES"),
    CINEMA("CINEMA"),
    COMMUNICATION("COMMUNICATION"),
    ACCOUNTING("ACCOUNTING"),
    DECORATION("DECORATION"),
    DICTIONARIES("DICTIONARIES"),
    DIDACTICS("DIDACTICS"),
    RIGHT("RIGHT"),
    DOCUMENTS("DOCUMENTS"),
    ECOLOGY("ECOLOGY"),
    ECONOMY("ECONOMY"),
    ENGINEERING("ENGINEERING"),
    ENCYCLOPEDIAS("ENCYCLOPEDIAS"),
    LANGUAGE_TEACHING("LANGUAGE TEACHING"),
    PHILOSOPHY("PHILOSOPHY"),
    PHOTOGRAPHY("PHOTOGRAPHY"),
    GEOGRAPHY("GEOGRAPHY"),
    WAR("WAR"),
    HISTORY("HISTORY"),
    COMPUTERS("COMPUTERS"),
    LINGUISTICS("LINGUISTICS"),
    MEDICINE("MEDICINE"),
    FASHION("FASHION"),
    MUSIC("MUSIC"),
    LIVESTOCK("LIVESTOCK"),
    PEDAGOGY("PEDAGOGY"),
    PAINTING("PAINTING"),
    PSYCHOLOGY("PSYCHOLOGY"),
    HEALTH("HEALTH"),
    SOCIOLOGY("SOCIOLOGY"),
    THEATER("THEATRE"),
    TOURISM("TOURISM");

    private String description;
}
