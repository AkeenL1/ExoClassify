# ExoClassify

### Java-based application to fetch, process, and analyze data from NASA's Exoplanet Archive

Specifications are taken from the **Nasa Exoplanet Query** project

- The github can be found
  here: https://github.com/florinpop17/app-ideas/blob/master/Projects/3-Advanced/NASA-Exoplanet-Query.md

This project will be adapted as a command line interface tool, meaning **all** user stories *and* bonus features will be
completed.

## User Stories

-   [ ] User can see an query input panel containing dropdowns allowing the
    user to query on year of discovery, discovery method, host name, and discovery
    facility.
-   [ ] User can also see 'Clear' and 'Search' buttons in the query input panel.
-   [ ] User can select a single value from any one or all of the query
    dropdowns.
-   [ ] User can click the 'Search' button to search for exoplanets matching
    all of the selected query values.
-   [ ] User can see an error message if the 'Search' button was clicked, but
    no query values were selected.
-   [ ] User can see the matching exoplanet data displayed in tabular format
    in an results panel below the query panel. Only the queriable fields should
    be displayed.
-   [ ] User can click the 'Clear' button to reset the query selections and
    clear any data displayed in the results panel, if a search had been performed.

## Bonus features

-   [ ] User can see the host name as a hyperlink to NASA's Confirmed Planet
    Overview Page for that planet
-   [ ] User can click on the host name to display the Confirmed Planet Overview
    Page in a new browser tab.
-   [ ] User can see icons (such as up and down symbols) in the column headers
-   [ ] User can click on the up symbol to sort the rows in the results panel
    in ascending order on the values in that column.
-   [ ] User can click on the down symbol to sort the rows in the results panel
    in descending order on the values in the column.