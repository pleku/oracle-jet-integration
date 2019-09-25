# Oracle JET web component integrations for Vaadin

List of components:
- OjButton

## Development instructions

Starting the test/demo server:
1. Run `mvn jetty:run`.
2. Open http://localhost:8080 in the browser.

## Usage in Vaadin Application Project

1. Clone the project locally
2. Run `mvn install` to get the artifact to your local Maven repository
3. include the artifact to your application project using:
```xml
<dependency>
  <groupId>org.jetflow</groupId>
  <artifactId>oracle-jet-vaadin-integration</artifactId>
  <version>1.0-SNAPSHOT</version>
</dependency>
```
4. In your application project, modify the file `webpack.generated.js` by removing the
`BabelMultiTargetPlugin` from `plugins`: 
```json
 plugins: [
    // Transpile with babel, and produce different bundles per browser
    new BabelMultiTargetPlugin({
     ...
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
5. Copy the `webpack.config.js` file from this project to the application project.
It is needed for making sure Oracle JET frontend sources are imported properly and modified a bit. 
6. Copy the folder `plugins` from this project to the application project.
7. Copy the folder `loaders` from this project to the application project.

### Patches Welcome
