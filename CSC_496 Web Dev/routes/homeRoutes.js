const apiRoutes = require("./apiRoutes");
const router = require("express").Router();
const homeController = require("../controllers/homeController");

router.use('/api', apiRoutes);
router.get("/", homeController.indexView);
router.get("/users", homeController.showUserList);
router.get('/contacts/add',homeController.contactPage);
router.post('/users', homeController.updateUsers);

module.exports = router; 
