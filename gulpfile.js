const gulp      = require('gulp');
const uglify    = require('gulp-uglify');
const uglifycss = require('gulp-uglifycss');
const concat    = require('gulp-concat');
const rename    = require('gulp-rename');
const clean     = require('gulp-clean');

const options = {
  baseDir:    "./src/main/resources/static",
  jsFiles:    "./src/main/resources/static/js/*.js",
  cssFiles:   "./src/main/resources/static/css/*.css",
  distFolder: "./src/main/resources/static/dist",
  dependencies: {
    css: [
      "./node_modules/bootstrap/dist/css/bootstrap.min.css",
      "./node_modules/font-awesome/css/font-awesome.min.css"
    ],
    js: [
      "./node_modules/jquery/dist/jquery.min.js",
      "./node_modules/bootstrap/dist/js/bootstrap.min.js"
    ]
  }
};

gulp.task('dist', ['dist_js', 'dist_css']);

gulp.task('clean', () => {
  gulp.src(options.distFolder)
    .pipe(clean());
});

gulp.task('dist_js', () => {
  gulp.src(options.dependencies.js.concat([options.jsFiles]))
    .pipe(concat(options.distFolder))
    .pipe(rename('dist.min.js'))
    .pipe(uglify())
    .pipe(gulp.dest(options.distFolder));
});

gulp.task('dist_css', () => {
  gulp.src(options.dependencies.css.concat([options.cssFiles]))
    .pipe(concat(options.distFolder))
    .pipe(rename('dist.min.css'))
    .pipe(uglifycss())
    .pipe(gulp.dest(options.distFolder));
})

gulp.task('default', ['clean', 'dist']);
