const router = require("express").Router(),
    homeController = require("../controllers/homeController");

router.get("/users", homeController.showUserList,
    homeController.respondJSON);

router.use(homeController.errorJSON);
module.exports = router; 