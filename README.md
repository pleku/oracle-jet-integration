# Oracle JET web component integrations for Vaadin

List of components:
- OjButton

## Development instructions

Starting the test/demo server:
1. Run `mvn jetty:run`.
2. Open http://localhost:8080 in the browser.

## Usage in Vaadin Application Project

**See the example here:
https://github.com/vaadin/skeleton-starter-flow/compare/demo/oracle-jet?expand=1
You need to clone this project and install it first (mvn install)**

Or try to follow the steps:

1. Clone this component project locally
2. Run `mvn install` for this component project to get the artifact to your local Maven repository
3. Switch to your application project, and start it up once (start server)
4. Include the JET component artifact to your application project `pom.xml` using:
```xml
<dependency>
  <groupId>org.jetflow</groupId>
  <artifactId>oracle-jet-vaadin-integration</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
5. Remove the `vaadin-maven-plugin`'s `prepare-frontend` goal from `pom.xml` so that it will not recreate stuff
6. In your application project, modify the file `webpack.generated.js` by removing the
`BabelMultiTargetPlugin` from `plugins`: 
```json
 plugins: [
    // Transpile with babel, and produce different bundles per browser
    new BabelMultiTargetPlugin({
     // this plugin needs to be removed
    }),
```
And switch the first `module.rules` to 
```json
  module: {
    rules: [
      { // Files that Babel has to transpile
        test: /\.js$/,
        use: 'babel-loader'
      },
```
7. Copy the `webpack.config.js` file from this project to the application project.
It is needed for making sure Oracle JET frontend sources are imported properly and modified a bit. 
8. Copy the folder `plugins` from this project to the application project.
9. Copy the folder `loaders` from this project to the application project.

### Patches Welcome
